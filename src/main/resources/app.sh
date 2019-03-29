#!/bin/sh
# 函数名
f=$1
ev=$2
# get basepath in parament
current=$(dirname $0)
cd ${current}
# 获取应用全路径
function get_full_app_path(){
	# statememnt app deployment path 
	app_deploy_path=$1
	max_time=0
	max_time_file=""
	for FILE in $app_deploy_path/*.jar
	do
        	modify_date=`date +%s -r ${FILE}`
        	if test $[$modify_date] -gt $[$max_time]
                then
                        max_time=$modify_date
                        max_time_file=$FILE
       		fi
	done
	echo "$max_time_file"

}
# 获取应用名称
function get_app(){
	# get app path
	path=$1
	app_path=$(get_full_app_path ${path})
	echo "${app_path##*/}"
}
function stoped(){
	# incoming directory
	app_directoy=$1
	# get app path
	app=$(get_app $app_directoy)	
	if [ -z "${app}" ]; then 
		echo "no find app $app"
	else
		pid=`ps -ef | grep ${app} | grep -v grep | awk '{print $2}'`
		if [ -n "${pid}" ]; then
			kill -9 $pid
			echo "stop OK"
		else
			echo "haven't app run"
		fi
	fi	
}

function started(){
	# incoming direcory
	app_directoy=$1
	#get app path
	app_path=$(get_full_app_path ${app_directoy})
	echo ${app_path}
	chmod 777 ${app_path}
	## JAVA_HOME/java ...
	nohup /usr/bin/java -Xms512m -Xmx512m -javaagent:/home/fuyi/skywalking-apm/agent/skywalking-agent.jar -Dskywalking.agent.service_name=spider $ev -jar ${app_path} &
}

case $f in
    start)
	echo "starting app"
	started ${current}
	;;
    stop)
	echo "stoping app"
	stoped ${current}
	;;
    restart)
	stoped ${current}
	started ${current}
	echo "restart"
	;;
    *)
	echo "start [Release directory],stop [Release directory],restart [Release directory], deploy [Release directory] [project]"
	;;
esac

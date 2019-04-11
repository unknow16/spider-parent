package com.unknow.spiderparent;

import com.alibaba.fastjson.JSON;
import com.unknow.spiderparent.vo.OptionVo;
import com.unknow.spiderparent.entity.RaceInfo;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class SpiderParentApplicationTests {

	@Test
	public void contextLoads() {
		String s = "{\"pageInfo\":{\"type\":1,\"pageNum\":1,\"pageSize\":10},\"basicInfo\":[\"full_host_win\",\"full_guest_win\"],\"enterBallNum\":{\"type\":[1,2,3],\"columns\":[\"s_1\",\"s_2\"]},\"scoreOr\":{\"columns\":[\"s_1_1\",\"s_2_2\"],\"hostType\":[1],\"sessionType\":[1,2]}}";

		OptionVo optionVo = JSON.parseObject(s, OptionVo.class);
		System.out.println(optionVo);
	}

	/**
	 * ID=cp-79321987-40-2040216004-C5;
	 * IT=P3793219872040216004;
	 * NA=富勒姆;
	 * FI=79321987;
	 * BC=20190330123000;
	 * PD=#AC#B1#C1#D8#E79321987#F3#R0#P^14#Q^37628399#;    比赛id
	 * FF=;
	 * ML=,,;
	 * FS=0;
	 *
	 * ID=cp-79321987-40-2040216007-C5;
	 * IT=P3793219872040216007;
	 * NA=曼城;
	 * FI=79321987;
	 * EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736871~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;
	 * PD=#AC#B1#C1#D8#E79321987#F3#R0#P^14#Q^37628399#;
	 * FF=;
	 * ML=,,;
	 * FS=0;
	 *
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Integer type = 1;

		String s = "|PA;ID=cp-79321987-40-2040216004-C5;IT=P3793219872040216004;NA=富勒姆;FI=79321987;BC=20190330123000;PD=#AC#B1#C1#D8#E79321987#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79321987-40-2040216007-C5;IT=P3793219872040216007;NA=曼城;FI=79321987;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736871~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79321987#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79321987-40-2040216006-C5;IT=P3793219872040216006;NA=平局;FI=79321987;PD=#AC#B1#C1#D8#E79321987#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79321991-40-2040216050-C5;IT=P3793219912040216050;NA=伯恩利;FI=79321991;BC=20190330150000;PD=#AC#B1#C1#D8#E79321991#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79321991-40-2040216053-C5;IT=P3793219912040216053;NA=伍尔弗汉普顿;FI=79321991;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736865~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79321991#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79321991-40-2040216052-C5;IT=P3793219912040216052;NA=平局;FI=79321991;PD=#AC#B1#C1#D8#E79321991#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79321989-40-2040216028-C5;IT=P3793219892040216028;NA=布莱顿;FI=79321989;BC=20190330150000;PD=#AC#B1#C1#D8#E79321989#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79321989-40-2040216030-C5;IT=P3793219892040216030;NA=南安普顿;FI=79321989;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736863~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79321989#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79321989-40-2040216029-C5;IT=P3793219892040216029;NA=平局;FI=79321989;PD=#AC#B1#C1#D8#E79321989#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79321997-40-2040216102-C5;IT=P3793219972040216102;NA=曼联;FI=79321997;BC=20190330150000;PD=#AC#B1#C1#D8#E79321997#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79321997-40-2040216104-C5;IT=P3793219972040216104;NA=沃特福德;FI=79321997;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736877~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79321997#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79321997-40-2040216103-C5;IT=P3793219972040216103;NA=平局;FI=79321997;PD=#AC#B1#C1#D8#E79321997#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79321993-40-2040216068-C5;IT=P3793219932040216068;NA=水晶宫;FI=79321993;BC=20190330150000;PD=#AC#B1#C1#D8#E79321993#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79321993-40-2040216070-C5;IT=P3793219932040216070;NA=哈德斯菲尔德;FI=79321993;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736869~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79321993#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79321993-40-2040216069-C5;IT=P3793219932040216069;NA=平局;FI=79321993;PD=#AC#B1#C1#D8#E79321993#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79321995-40-2040216089-C5;IT=P3793219952040216089;NA=莱斯特;FI=79321995;BC=20190330150000;PD=#AC#B1#C1#D8#E79321995#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79321995-40-2040216091-C5;IT=P3793219952040216091;NA=伯恩茅斯;FI=79321995;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736873~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79321995#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79321995-40-2040216090-C5;IT=P3793219952040216090;NA=平局;FI=79321995;PD=#AC#B1#C1#D8#E79321995#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79322001-40-2040216129-C5;IT=P3793220012040216129;NA=西汉姆;FI=79322001;BC=20190330173000;PD=#AC#B1#C1#D8#E79322001#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79322001-40-2040216131-C5;IT=P3793220012040216131;NA=埃弗顿;FI=79322001;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736879~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79322001#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79322001-40-2040216130-C5;IT=P3793220012040216130;NA=平局;FI=79322001;PD=#AC#B1#C1#D8#E79322001#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79322003-40-2040216151-C5;IT=P3793220032040216151;NA=卡迪夫;FI=79322003;BC=20190331140500;PD=#AC#B1#C1#D8#E79322003#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79322003-40-2040216153-C5;IT=P3793220032040216153;NA=切尔西;FI=79322003;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736867~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79322003#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79322003-40-2040216152-C5;IT=P3793220032040216152;NA=平局;FI=79322003;PD=#AC#B1#C1#D8#E79322003#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79322005-40-2040216170-C5;IT=P3793220052040216170;NA=利物浦;FI=79322005;BC=20190331163000;PD=#AC#B1#C1#D8#E79322005#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79322005-40-2040216172-C5;IT=P3793220052040216172;NA=托特纳姆热刺;FI=79322005;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736875~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79322005#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79322005-40-2040216171-C5;IT=P3793220052040216171;NA=平局;FI=79322005;PD=#AC#B1#C1#D8#E79322005#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79322009-40-2040216265-C5;IT=P3793220092040216265;NA=阿森纳;FI=79322009;BC=20190401200000;PD=#AC#B1#C1#D8#E79322009#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79322009-40-2040216269-C5;IT=P3793220092040216269;NA=纽卡斯尔;FI=79322009;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736861~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79322009#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79322009-40-2040216267-C5;IT=P3793220092040216267;NA=平局;FI=79322009;PD=#AC#B1#C1#D8#E79322009#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590406-40-2063524866-C5;IT=P3795904062063524866;NA=伍尔弗汉普顿;FI=79590406;BC=20190402194500;PD=#AC#B1#C1#D8#E79590406#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590406-40-2063524870-C5;IT=P3795904062063524870;NA=曼联;FI=79590406;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736883~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79590406#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590406-40-2063524869-C5;IT=P3795904062063524869;NA=平局;FI=79590406;PD=#AC#B1#C1#D8#E79590406#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79633871-40-2066585007-C5;IT=P3796338712066585007;NA=沃特福德;FI=79633871;BC=20190402194500;PD=#AC#B1#C1#D8#E79633871#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79633871-40-2066585011-C5;IT=P3796338712066585011;NA=富勒姆;FI=79633871;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736885~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79633871#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79633871-40-2066585009-C5;IT=P3796338712066585009;NA=平局;FI=79633871;PD=#AC#B1#C1#D8#E79633871#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590408-40-2063524942-C5;IT=P3795904082063524942;NA=托特纳姆热刺;FI=79590408;BC=20190403190000;PD=#AC#B1#C1#D8#E79590408#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590408-40-2063524946-C5;IT=P3795904082063524946;NA=水晶宫;FI=79590408;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/17693928~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79590408#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590408-40-2063524944-C5;IT=P3795904082063524944;NA=平局;FI=79590408;PD=#AC#B1#C1#D8#E79590408#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79633874-40-2066585041-C5;IT=P3796338742066585041;NA=切尔西;FI=79633874;BC=20190403194500;PD=#AC#B1#C1#D8#E79633874#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79633874-40-2066585043-C5;IT=P3796338742066585043;NA=布莱顿;FI=79633874;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/17724388~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79633874#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79633874-40-2066585042-C5;IT=P3796338742066585042;NA=平局;FI=79633874;PD=#AC#B1#C1#D8#E79633874#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79633876-40-2066585076-C5;IT=P3796338762066585076;NA=曼城;FI=79633876;BC=20190403194500;PD=#AC#B1#C1#D8#E79633876#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79633876-40-2066585078-C5;IT=P3796338762066585078;NA=卡迪夫;FI=79633876;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736893~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79633876#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79633876-40-2066585077-C5;IT=P3796338762066585077;NA=平局;FI=79633876;PD=#AC#B1#C1#D8#E79633876#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590412-40-2063524971-C5;IT=P3795904122063524971;NA=南安普顿;FI=79590412;BC=20190405200000;PD=#AC#B1#C1#D8#E79590412#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590412-40-2063524973-C5;IT=P3795904122063524973;NA=利物浦;FI=79590412;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736889~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79590412#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590412-40-2063524972-C5;IT=P3795904122063524972;NA=平局;FI=79590412;PD=#AC#B1#C1#D8#E79590412#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590414-40-2063525011-C5;IT=P3795904142063525011;NA=伯恩茅斯;FI=79590414;BC=20190406150000;PD=#AC#B1#C1#D8#E79590414#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590414-40-2063525013-C5;IT=P3795904142063525013;NA=伯恩利;FI=79590414;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736881~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79590414#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590414-40-2063525012-C5;IT=P3795904142063525012;NA=平局;FI=79590414;PD=#AC#B1#C1#D8#E79590414#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590416-40-2063525086-C5;IT=P3795904162063525086;NA=哈德斯菲尔德;FI=79590416;BC=20190406150000;PD=#AC#B1#C1#D8#E79590416#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590416-40-2063525091-C5;IT=P3795904162063525091;NA=莱斯特;FI=79590416;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736895~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79590416#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590416-40-2063525089-C5;IT=P3795904162063525089;NA=平局;FI=79590416;PD=#AC#B1#C1#D8#E79590416#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590419-40-2063525151-C5;IT=P3795904192063525151;NA=纽卡斯尔;FI=79590419;BC=20190406150000;PD=#AC#B1#C1#D8#E79590419#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590419-40-2063525153-C5;IT=P3795904192063525153;NA=水晶宫;FI=79590419;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736891~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79590419#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590419-40-2063525152-C5;IT=P3795904192063525152;NA=平局;FI=79590419;PD=#AC#B1#C1#D8#E79590419#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590421-40-2063525205-C5;IT=P3795904212063525205;NA=埃弗顿;FI=79590421;BC=20190407140000;PD=#AC#B1#C1#D8#E79590421#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590421-40-2063525208-C5;IT=P3795904212063525208;NA=阿森纳;FI=79590421;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736897~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79590421#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590421-40-2063525207-C5;IT=P3795904212063525207;NA=平局;FI=79590421;PD=#AC#B1#C1#D8#E79590421#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590424-40-2063525274-C5;IT=P3795904242063525274;NA=切尔西;FI=79590424;BC=20190408200000;PD=#AC#B1#C1#D8#E79590424#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590424-40-2063525284-C5;IT=P3795904242063525284;NA=西汉姆;FI=79590424;EX=puw~https://s5.sir.sportradar.com/bet365/zh/match/14736899~Bet365Stats~Height=700,Width=1180,statusbar=yes,left=25,top=25,scrollbars=yes,resizable=1;PD=#AC#B1#C1#D8#E79590424#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;|PA;ID=cp-79590424-40-2063525281-C5;IT=P3795904242063525281;NA=平局;FI=79590424;PD=#AC#B1#C1#D8#E79590424#F3#R0#P^14#Q^37628399#;FF=;ML=,,;FS=0;";
		String[] split = s.split("\\|PA;");

		List<RaceInfo> raceInfoList = new ArrayList<>();
		for(int i = 1; i < split.length; i = i+3) {
			RaceInfo raceInfo = new RaceInfo();

			String hostInfoStr = split[i];
			String[] hostInfo = hostInfoStr.split(";");
			raceInfo.setRaceId(hostInfo[5].split("=")[1]);
			raceInfo.setRaceType(type);

			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
			raceInfo.setRaceTime(sdf.parse(hostInfo[4].split("=")[1]));
			raceInfo.setHostTeam(hostInfo[2]);

			String guestInfoStr = split[i+1];
			String[] guestInfo = guestInfoStr.split(";");
			raceInfo.setGuestTeam(guestInfo[2]);
			raceInfoList.add(raceInfo);
		}
	}

	/**
	 * 全场赛果 3
	 *
	 * ID=G40;
	 * IT=G40;
	 * NA=全场赛果;
	 * DO=1;
	 *
	 * |MA;ID=M40;IT=M40;CN=3;SY=A;PY=a;
	 *
	 * |PA;ID=2040216004;IT=79321987-2040216004;NA=富勒姆;OD=16/1;NF=79321987;
	 * |PA;ID=2040216006;IT=79321987-2040216006;NA=平局;OD=13/2;NF=79321987;
	 * |PA;ID=2040216007;IT=79321987-2040216007;NA=曼城;OD=1/7;NF=79321987;
	 */
	@Test
	public void test1() {
		String source = "ID=G40;IT=G40;NA=全场赛果;DO=1;|MA;ID=M40;IT=M40;CN=3;SY=A;PY=a;|PA;ID=2040216004;IT=79321987-2040216004;NA=富勒姆;OD=16/1;NF=79321987;|PA;ID=2040216006;IT=79321987-2040216006;NA=平局;OD=13/2;NF=79321987;|PA;ID=2040216007;IT=79321987-2040216007;NA=曼城;OD=1/7;NF=79321987;";

		String[] fullResultRate = source.split("\\|PA;");
		String[] rateArray = fullResultRate[1].split(";")[3].split("=")[1].split("/");
		Double rate = Double.parseDouble(rateArray[0]) / Double.parseDouble(rateArray[1] + 1.00);
	}

	/**
	 * 主要盘口（半/全场） 半全场胜平负  6
	 *
	 * ID=G42;IT=G42;NA=半/全场;DO=1;|MA;ID=M42;IT=M42;CN=3;SY=A;PY=a;
	 *
	 * |PA;ID=2040235242;IT=79321987-2040235242;NA=富勒姆 - 富勒姆;OD=28/1;NF=79321987;  AA
	 * |PA;ID=2040235243;IT=79321987-2040235243;NA=富勒姆 - 平局;OD=28/1;NF=79321987;
	 * |PA;ID=2040235244;IT=79321987-2040235244;NA=富勒姆 - 曼城;OD=20/1;NF=79321987;
	 * |PA;ID=2040235245;IT=79321987-2040235245;NA=平局 - 富勒姆;OD=33/1;NF=79321987;
	 * |PA;ID=2040235246;IT=79321987-2040235246;NA=平局 - 平局;OD=14/1;NF=79321987;
	 * |PA;ID=2040235247;IT=79321987-2040235247;NA=平局 - 曼城;OD=10/3;NF=79321987;
	 * |PA;ID=2040235248;IT=79321987-2040235248;NA=曼城 - 富勒姆;OD=100/1;NF=79321987;
	 * |PA;ID=2040235249;IT=79321987-2040235249;NA=曼城 - 平局;OD=28/1;NF=79321987;
	 * |PA;ID=2040235250;IT=79321987-2040235250;NA=曼城 - 曼城;OD=1/2;NF=79321987;
	 */
	@Test
	public void test2() {
		String source = "|MG;ID=G42;IT=G42;NA=半/全场;DO=1;|MA;ID=M42;IT=M42;CN=3;SY=A;PY=a;|PA;ID=2040235242;IT=79321987-2040235242;NA=富勒姆 - 富勒姆;OD=28/1;NF=79321987;|PA;ID=2040235243;IT=79321987-2040235243;NA=富勒姆 - 平局;OD=28/1;NF=79321987;|PA;ID=2040235244;IT=79321987-2040235244;NA=富勒姆 - 曼城;OD=20/1;NF=79321987;|PA;ID=2040235245;IT=79321987-2040235245;NA=平局 - 富勒姆;OD=33/1;NF=79321987;|PA;ID=2040235246;IT=79321987-2040235246;NA=平局 - 平局;OD=14/1;NF=79321987;|PA;ID=2040235247;IT=79321987-2040235247;NA=平局 - 曼城;OD=10/3;NF=79321987;|PA;ID=2040235248;IT=79321987-2040235248;NA=曼城 - 富勒姆;OD=100/1;NF=79321987;|PA;ID=2040235249;IT=79321987-2040235249;NA=曼城 - 平局;OD=28/1;NF=79321987;|PA;ID=2040235250;IT=79321987-2040235250;NA=曼城 - 曼城;OD=1/2;NF=79321987;";
		String[] halfFullWinRate = source.split("\\|PA;");

		String[] AA = halfFullWinRate[1].split(";")[3].split("=")[1].split("/");
		Double AARate = Double.parseDouble(AA[0]) / Double.parseDouble(AA[1] + 1.00);
	}
}

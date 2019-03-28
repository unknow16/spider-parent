package com.unknow.spiderparent.common;

public class BaseConstants {

    public static final String DOMAIN = "https://www.188-sb.com";
    public static final String BASE_URL = DOMAIN + "/SportsBook.API/web";

    // 入球数类型 1=上半场进球数， 2=全场总进球数， 3=全场主队进球总数， 4=全场客队进球总数
    public static final Integer UP_SECTION_ENTER_BALL_NUM = 1;
    public static final Integer FULL_SECTION_TOTAL_ENTER_BALL_NUM = 2;
    public static final Integer FULL_SECTION_HOST_ENTER_BALL_NUM = 3;
    public static final Integer FULL_SECTION_GUEST_ENTER_BALL_NUM = 4;

    /**
     *    联赛id
     *
     *    英超、西甲、德甲：每年8月底---次年5月中下旬
     *    瑞典超、日本J、J2联赛：每年3月初---12月
     *    欧冠、欧洲联赛（原联盟杯）：在五大联赛中穿插进行
     *    世界杯、 欧洲杯、美洲杯、亚洲杯：每4年一届
     */
    public static final String YING_CHAO = "#AC#B1#C1#D14#E37628399#F2#"; // 英超
    public static final String XI_JIA = "#AC#B1#C1#D14#E38119369#F2#"; // 西甲
    public static final String DE_JIA = "#AC#B1#C1#D14#E37924413#F2#"; // 德甲

    public static final String RUI_DI_CHAO = "#AC#B1#C1#D14#E40950648#F2#"; // 瑞典超
    public static final String OU_GUAN = "#AC#B1#C1#D14#E38556321#F2#";  // 欧冠

    public static final String RI_BEN_J = "#AC#B1#C1#D14#E40588216#F2#"; // 日本J
    public static final String RI_BEN_J2 = "#AC#B1#C1#D14#E40588909#F2#"; // 日本J2

    public static final String OU_ZHOU_LIAN_SAI = "#AC#B1#C1#D14#E38564378#F2#";  // 欧洲联赛

    public static final String MEI_ZHOU_BEI = "#AC#B1#C1#D14#E40613282#F2#";  // 美洲杯

}

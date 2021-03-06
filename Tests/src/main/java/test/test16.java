package test;
import java.util.ArrayList;
import java.util.List;


public class test16 {
	
	private static int  LENGTH = 2;
	
	public static void main(String[] args) {
		
		List<String> list = initList();
		
		for(int i = 0; i< list.size(); i++) {
			String srcStr = list.get(i);
			for(int j = 0 ; j<list.size() ; j++){
				String descStr = list.get(j);
				if(descStr.contains(srcStr) && i != j){
					System.out.println(srcStr +" 包含在了 "+ descStr+" 中！！");
				}
			}
		}
		
		
	}
	
	/**
	 * 去除省市等地区信息
	 * auth: minchao.du
	 */
	public static String getReportCustomerName(String bankCustomerName,String lefuOrgCode) {
		List<String> orgNames = new ArrayList<String>();
		orgNames.add("长沙市");
		orgNames.add("长沙县");
		orgNames.add("沙市市");
		int provinceIndex = bankCustomerName.indexOf("省");
		int endIndex = bankCustomerName.length() - 4;
		if(provinceIndex> 0 && provinceIndex < endIndex){
			bankCustomerName = bankCustomerName.substring(provinceIndex + 1);//去掉省之前的字
		}
		int townIndex = bankCustomerName.indexOf("市");
		if(townIndex > 0 && bankCustomerName.indexOf("市") < endIndex){
			bankCustomerName = bankCustomerName.substring(townIndex + 1);//去掉市之前的字
		}
		int zzzIndex = bankCustomerName.indexOf("自治州");
		if(zzzIndex > 0 && zzzIndex < endIndex){
			bankCustomerName = bankCustomerName.substring(zzzIndex + 3);//去掉自治州之前的字
		}
		
		for(String orgName : orgNames){
			String regStr = "市";
			orgName = orgName.replaceAll(regStr, "");
			String orgNameE = "("+orgName+")";
			String orgNameC = "（"+orgName+"）";
			if(bankCustomerName.contains(orgNameE)){
				bankCustomerName = bankCustomerName.replaceAll("\\(", "");
				bankCustomerName = bankCustomerName.replaceAll("\\)", "");
				bankCustomerName = bankCustomerName.replaceAll(orgName, "");
			}
			if(bankCustomerName.contains(orgNameC)){
				bankCustomerName = bankCustomerName.replaceAll("\\（", "");
				bankCustomerName = bankCustomerName.replaceAll("\\）", "");
				bankCustomerName = bankCustomerName.replaceAll(orgName, "");
			}
			if(bankCustomerName.contains(orgName)){
				bankCustomerName = bankCustomerName.replaceAll(orgName, "");
			}
		}

		
		/*for(String orgName : orgNames){
			orgName = orgName.replace("市", "");
			if(bankCustomerName.contains(orgName)){
				bankCustomerName = bankCustomerName.replaceAll(orgName, "");
			}
		}*/
		return bankCustomerName;
	}
	
	public static List<String> initList(){
		List<String> list = new ArrayList<String>();
		
		list.add("芒");
		list.add("重庆");
		list.add("辖区");
		list.add("淮阴");
		list.add("盐城");
		list.add("扬州");
		list.add("镇江");
		list.add("杭州");
		list.add("宁波");
		list.add("温州");
		list.add("嘉兴");
		list.add("湖州");
		list.add("绍兴");
		list.add("金华");
		list.add("衢州");
		list.add("舟山");
		list.add("合肥");
		list.add("芜湖");
		list.add("蚌埠");
		list.add("淮南");
		list.add("淮北");
		list.add("铜陵");
		list.add("安庆");
		list.add("黄山");
		list.add("滁州");
		list.add("福州");
		list.add("厦门");
		list.add("莆田");
		list.add("三明");
		list.add("泉州");
		list.add("漳州");
		list.add("南昌");
		list.add("萍乡");
		list.add("九江");
		list.add("新余");
		list.add("鹰潭");
		list.add("济南");
		list.add("青岛");
		list.add("淄博");
		list.add("枣庄");
		list.add("东营");
		list.add("烟台");
		list.add("潍坊");
		list.add("济宁");
		list.add("泰安");
		list.add("威海");
		list.add("日照");
		list.add("莱芜");
		list.add("郑州");
		list.add("开封");
		list.add("洛阳");
		list.add("安阳");
		list.add("鹤壁");
		list.add("新乡");
		list.add("焦作");
		list.add("濮阳");
		list.add("许昌");
		list.add("漯河");
		list.add("武汉");
		list.add("黄石");
		list.add("十堰");
		list.add("宜昌");
		list.add("襄樊");
		list.add("鄂州");
		list.add("荆门");
		list.add("孝感");
		list.add("长沙");
		list.add("株洲");
		list.add("湘潭");
		list.add("衡阳");
		list.add("邵阳");
		list.add("岳阳");
		list.add("常德");
		list.add("南宁");
		list.add("柳州");
		list.add("桂林");
		list.add("梧州");
		list.add("北海");
		list.add("海口");
		list.add("三亚");
		list.add("成都");
		list.add("自贡");
		list.add("泸州");
		list.add("德阳");
		list.add("绵阳");
		list.add("广元");
		list.add("遂宁");
		list.add("内江");
		list.add("乐山");
		list.add("万县");
		list.add("南充");
		list.add("贵阳");
		list.add("昆明");
		list.add("东川");
		list.add("拉萨");
		list.add("西安");
		list.add("铜川");
		list.add("宝鸡");
		list.add("咸阳");
		list.add("兰州");
		list.add("金昌");
		list.add("白银");
		list.add("天水");
		list.add("西宁");
		list.add("银川");
		list.add("泰州");
		list.add("衡水");
		list.add("晋中");
		list.add("运城");
		list.add("忻州");
		list.add("临汾");
		list.add("吕梁");
		list.add("通辽");
		list.add("绥化");
		list.add("宿迁");
		list.add("台州");
		list.add("丽水");
		list.add("阜阳");
		list.add("宿州");
		list.add("巢湖");
		list.add("六安");
		list.add("亳州");
		list.add("池州");
		list.add("宣城");
		list.add("南平");
		list.add("龙岩");
		list.add("宁德");
		list.add("赣州");
		list.add("吉安");
		list.add("宜春");
		list.add("抚州");
		list.add("上饶");
		list.add("临沂");
		list.add("德州");
		list.add("聊城");
		list.add("滨州");
		list.add("菏泽");
		list.add("南阳");
		list.add("商丘");
		list.add("信阳");
		list.add("周口");
		list.add("荆州");
		list.add("黄冈");
		list.add("咸宁");
		list.add("随州");
		list.add("益阳");
		list.add("郴州");
		list.add("永州");
		list.add("怀化");
		list.add("娄底");
		list.add("云浮");
		list.add("钦州");
		list.add("贵港");
		list.add("玉林");
		list.add("百色");
		list.add("贺州");
		list.add("河池");
		list.add("来宾");
		list.add("崇左");
		list.add("眉山");
		list.add("宜宾");
		list.add("广安");
		list.add("达州");
		list.add("雅安");
		list.add("巴中");
		list.add("资阳");
		list.add("遵义");
		list.add("安顺");
		list.add("曲靖");
		list.add("玉溪");
		list.add("保山");
		list.add("昭通");
		list.add("丽江");
		list.add("普洱");
		list.add("临沧");
		list.add("渭南");
		list.add("延安");
		list.add("汉中");
		list.add("榆林");
		list.add("安康");
		list.add("商洛");
		list.add("武威");
		list.add("张掖");
		list.add("平凉");
		list.add("酒泉");
		list.add("庆阳");
		list.add("定西");
		list.add("陇南");
		list.add("吴忠");
		list.add("固原");
		list.add("中卫");
		list.add("辖区");
		list.add("中山");
		list.add("奉化");
		list.add("北京");
		list.add("天津");
		list.add("河北");
		list.add("山西");
		list.add("辽宁");
		list.add("吉林");
		list.add("辖县");
		list.add("上海");
		list.add("江苏");
		list.add("浙江");
		list.add("安徽");
		list.add("福建");
		list.add("江西");
		list.add("山东");
		list.add("河南");
		list.add("湖北");
		list.add("湖南");
		list.add("广东");
		list.add("广西");
		list.add("海南");
		list.add("四川");
		list.add("贵州");
		list.add("云南");
		list.add("西藏");
		list.add("陕西");
		list.add("甘肃");
		list.add("青海");
		list.add("宁夏");
		list.add("新疆");
		list.add("辖区");
		list.add("辖县");
		list.add("广州");
		list.add("韶关");
		list.add("深圳");
		list.add("珠海");
		list.add("汕头");
		list.add("佛山");
		list.add("江门");
		list.add("湛江");
		list.add("茂名");
		list.add("肇庆");
		list.add("惠州");
		list.add("梅州");
		list.add("汕尾");
		list.add("河源");
		list.add("阳江");
		list.add("清远");
		list.add("东莞");
		list.add("潮州");
		list.add("揭阳");
		list.add("辖区");
		list.add("辖县");
		list.add("唐山");
		list.add("邯郸");
		list.add("邢台");
		list.add("保定");
		list.add("承德");
		list.add("沧洲");
		list.add("廊坊");
		list.add("太原");
		list.add("大同");
		list.add("阳泉");
		list.add("长治");
		list.add("晋城");
		list.add("朔州");
		list.add("包头");
		list.add("乌海");
		list.add("赤峰");
		list.add("沈阳");
		list.add("大连");
		list.add("鞍山");
		list.add("抚顺");
		list.add("本溪");
		list.add("丹东");
		list.add("锦州");
		list.add("营口");
		list.add("阜新");
		list.add("辽阳");
		list.add("盘锦");
		list.add("铁岭");
		list.add("朝阳");
		list.add("长春");
		list.add("吉林");
		list.add("四平");
		list.add("辽源");
		list.add("通化");
		list.add("白山");
		list.add("松原");
		list.add("白城");
		list.add("鸡西");
		list.add("鹤岗");
		list.add("大庆");
		list.add("伊春");
		list.add("黑河");
		list.add("南京");
		list.add("无锡");
		list.add("徐州");
		list.add("常州");
		list.add("苏州");
		list.add("南通");
		list.add("兴平");
		list.add("韩城");
		list.add("华阴");
		list.add("玉门");
		list.add("敦煌");
		list.add("临夏");
		list.add("合作");
		list.add("新民");
		list.add("庄河");
		list.add("海城");
		list.add("东港");
		list.add("凤城");
		list.add("凌海");
		list.add("北镇");
		list.add("盖州");
		list.add("灯塔");
		list.add("开原");
		list.add("北票");
		list.add("凌源");
		list.add("兴城");
		list.add("九台");
		list.add("榆树");
		list.add("德惠");
		list.add("蛟河");
		list.add("桦甸");
		list.add("舒兰");
		list.add("磐石");
		list.add("双辽");
		list.add("集安");
		list.add("临江");
		list.add("洮南");
		list.add("大安");
		list.add("延吉");
		list.add("图们");
		list.add("敦化");
		list.add("珲春");
		list.add("龙井");
		list.add("和龙");
		list.add("双城");
		list.add("尚志");
		list.add("五常");
		list.add("讷河");
		list.add("虎林");
		list.add("密山");
		list.add("铁力");
		list.add("同江");
		list.add("富锦");
		list.add("海林");
		list.add("宁安");
		list.add("穆棱");
		list.add("北安");
		list.add("安达");
		list.add("肇东");
		list.add("海伦");
		list.add("江阴");
		list.add("宜兴");
		list.add("新沂");
		list.add("邳州");
		list.add("溧阳");
		list.add("金坛");
		list.add("常熟");
		list.add("昆山");
		list.add("太仓");
		list.add("启东");
		list.add("如皋");
		list.add("海门");
		list.add("东台");
		list.add("大丰");
		list.add("仪征");
		list.add("高邮");
		list.add("灵武");
		list.add("哈密");
		list.add("昌吉");
		list.add("阜康");
		list.add("博乐");
		list.add("喀什");
		list.add("和田");
		list.add("伊宁");
		list.add("奎屯");
		list.add("塔城");
		list.add("乌苏");
		list.add("根河");
		list.add("丰镇");
		list.add("辛集");
		list.add("藁城");
		list.add("晋州");
		list.add("新乐");
		list.add("鹿泉");
		list.add("遵化");
		list.add("迁安");
		list.add("武安");
		list.add("南宫");
		list.add("沙河");
		list.add("涿州");
		list.add("定州");
		list.add("安国");
		list.add("泊头");
		list.add("任丘");
		list.add("黄骅");
		list.add("河间");
		list.add("霸州");
		list.add("三河");
		list.add("冀州");
		list.add("深州");
		list.add("古交");
		list.add("高平");
		list.add("介休");
		list.add("永济");
		list.add("河津");
		list.add("原平");
		list.add("侯马");
		list.add("霍州");
		list.add("孝义");
		list.add("汾阳");
		list.add("广水");
		list.add("恩施");
		list.add("利川");
		list.add("仙桃");
		list.add("潜江");
		list.add("天门");
		list.add("浏阳");
		list.add("醴陵");
		list.add("湘乡");
		list.add("韶山");
		list.add("耒阳");
		list.add("常宁");
		list.add("潞城");
		list.add("武冈");
		list.add("汨罗");
		list.add("临湘");
		list.add("沅江");
		list.add("资兴");
		list.add("洪江");
		list.add("涟源");
		list.add("吉首");
		list.add("增城");
		list.add("从化");
		list.add("乐昌");
		list.add("南雄");
		list.add("台山");
		list.add("开平");
		list.add("鹤山");
		list.add("恩平");
		list.add("廉江");
		list.add("雷州");
		list.add("吴川");
		list.add("高州");
		list.add("化州");
		list.add("信宜");
		list.add("高要");
		list.add("四会");
		list.add("兴宁");
		list.add("陆丰");
		list.add("阳春");
		list.add("英德");
		list.add("连州");
		list.add("普宁");
		list.add("罗定");
		list.add("岑溪");
		list.add("东兴");
		list.add("桂平");
		list.add("北流");
		list.add("宜州");
		list.add("合山");
		list.add("凭祥");
		list.add("琼海");
		list.add("儋州");
		list.add("文昌");
		list.add("万宁");
		list.add("东方");
		list.add("彭州");
		list.add("邛崃");
		list.add("崇州");
		list.add("广汉");
		list.add("什邡");
		list.add("绵竹");
		list.add("江油");
		list.add("阆中");
		list.add("华蓥");
		list.add("万源");
		list.add("简阳");
		list.add("西昌");
		list.add("清镇");
		list.add("赤水");
		list.add("仁怀");
		list.add("兴义");
		list.add("凯里");
		list.add("都匀");
		list.add("福泉");
		list.add("安宁");
		list.add("宣威");
		list.add("楚雄");
		list.add("个旧");
		list.add("开远");
		list.add("蒙自");
		list.add("文山");
		list.add("景洪");
		list.add("大理");
		list.add("瑞丽");
		list.add("铜仁");
		list.add("毕节");
		list.add("米泉");
		list.add("济源");
		list.add("丹阳");
		list.add("扬中");
		list.add("句容");
		list.add("兴化");
		list.add("靖江");
		list.add("泰兴");
		list.add("姜堰");
		list.add("建德");
		list.add("富阳");
		list.add("临安");
		list.add("余姚");
		list.add("慈溪");
		list.add("奉化");
		list.add("瑞安");
		list.add("乐清");
		list.add("海宁");
		list.add("平湖");
		list.add("桐乡");
		list.add("诸暨");
		list.add("上虞");
		list.add("嵊州");
		list.add("兰溪");
		list.add("义乌");
		list.add("东阳");
		list.add("永康");
		list.add("江山");
		list.add("温岭");
		list.add("临海");
		list.add("龙泉");
		list.add("桐城");
		list.add("天长");
		list.add("明光");
		list.add("界首");
		list.add("宁国");
		list.add("福清");
		list.add("长乐");
		list.add("永安");
		list.add("石狮");
		list.add("晋江");
		list.add("南安");
		list.add("龙海");
		list.add("邵武");
		list.add("建瓯");
		list.add("建阳");
		list.add("漳平");
		list.add("福安");
		list.add("福鼎");
		list.add("乐平");
		list.add("瑞昌");
		list.add("贵溪");
		list.add("瑞金");
		list.add("南康");
		list.add("丰城");
		list.add("樟树");
		list.add("高安");
		list.add("德兴");
		list.add("章丘");
		list.add("胶州");
		list.add("即墨");
		list.add("平度");
		list.add("胶南");
		list.add("莱西");
		list.add("滕州");
		list.add("龙口");
		list.add("莱阳");
		list.add("莱州");
		list.add("蓬莱");
		list.add("招远");
		list.add("栖霞");
		list.add("海阳");
		list.add("青州");
		list.add("诸城");
		list.add("寿光");
		list.add("安丘");
		list.add("高密");
		list.add("昌邑");
		list.add("曲阜");
		list.add("兖州");
		list.add("邹城");
		list.add("新泰");
		list.add("肥城");
		list.add("文登");
		list.add("荣成");
		list.add("乳山");
		list.add("乐陵");
		list.add("禹城");
		list.add("临清");
		list.add("巩义");
		list.add("荥阳");
		list.add("新密");
		list.add("新郑");
		list.add("登封");
		list.add("偃师");
		list.add("舞钢");
		list.add("汝州");
		list.add("林州");
		list.add("卫辉");
		list.add("辉县");
		list.add("沁阳");
		list.add("孟州");
		list.add("禹州");
		list.add("长葛");
		list.add("义马");
		list.add("灵宝");
		list.add("邓州");
		list.add("永城");
		list.add("项城");
		list.add("大冶");
		list.add("宜都");
		list.add("当阳");
		list.add("枝江");
		list.add("枣阳");
		list.add("宜城");
		list.add("钟祥");
		list.add("应城");
		list.add("安陆");
		list.add("汉川");
		list.add("石首");
		list.add("洪湖");
		list.add("松滋");
		list.add("麻城");
		list.add("武穴");
		list.add("赤壁");
		list.add("阿城");
		list.add("吴江");
		list.add("通州");
		list.add("江都");
		list.add("连云港");
		list.add("马鞍山");
		list.add("景德镇");
		list.add("平顶山");
		list.add("三门峡");
		list.add("张家界");
		list.add("防城港");
		list.add("攀枝花");
		list.add("六盘水");
		list.add("嘉峪关");
		list.add("石嘴山");
		list.add("驻马店");
		list.add("内蒙古");
		list.add("黑龙江");
		list.add("石家庄");
		list.add("秦皇岛");
		list.add("张家口");
		list.add("兴安盟");
		list.add("葫芦岛");
		list.add("延边州");
		list.add("哈尔滨");
		list.add("双鸭山");
		list.add("佳木斯");
		list.add("七台河");
		list.add("牡丹江");
		list.add("阿尔山");
		list.add("瓦房店");
		list.add("普兰店");
		list.add("大石桥");
		list.add("调兵山");
		list.add("公主岭");
		list.add("梅河口");
		list.add("绥芬河");
		list.add("张家港");
		list.add("格尔木");
		list.add("德令哈");
		list.add("青铜峡");
		list.add("吐鲁番");
		list.add("库尔勒");
		list.add("阿克苏");
		list.add("阿图什");
		list.add("阿勒泰");
		list.add("石河子");
		list.add("阿拉尔");
		list.add("五家渠");
		list.add("满洲里");
		list.add("牙克石");
		list.add("扎兰屯");
		list.add("高碑店");
		list.add("冷水江");
		list.add("五指山");
		list.add("都江堰");
		list.add("峨眉山");
		list.add("日喀则");
		list.add("武夷山");
		list.add("共青城");
		list.add("井冈山");
		list.add("丹江口");
		list.add("老河口");
		list.add("三亚各县");
		list.add("乌鲁木齐");
		list.add("克拉玛依");
		list.add("重庆辖县");
		list.add("鄂尔多斯");
		list.add("呼伦贝尔");
		list.add("巴彦淖尔");
		list.add("乌兰察布");
		list.add("阿拉善盟");
		list.add("呼和浩特");
		list.add("哲里木盟");
		list.add("伊克昭盟");
		list.add("齐齐哈尔");
		list.add("二连浩特");
		list.add("锡林浩特");
		list.add("五大连池");
		list.add("乌兰浩特");
		list.add("图木舒克");
		list.add("额尔古纳");
		list.add("霍林郭勒");
		list.add("省直辖县");
		list.add("呼伦贝尔盟");
		list.add("锡林郭勒盟");
		list.add("乌兰察布盟");
		list.add("巴彦淖尔盟");
		list.add("甘孜藏族自治州");
		list.add("凉山彝族自治州");
		list.add("楚雄彝族自治州");
		list.add("大理白族自治州");
		list.add("迪庆藏族自治州");
		list.add("临夏回族自治州");
		list.add("甘南藏族自治州");
		list.add("海北藏族自治州");
		list.add("黄南藏族自治州");
		list.add("海南藏族自治州");
		list.add("果洛藏族自治州");
		list.add("玉树藏族自治州");
		list.add("昌吉回族自治州");
		list.add("怒江傈僳族自治州");
		list.add("伊犁哈萨克自治州");
		list.add("阿坝藏族羌族自治州");
		list.add("文山壮族苗族自治州");
		list.add("西双版纳傣族自治州");
		list.add("博尔塔拉蒙古自治州");
		list.add("巴音郭楞蒙古自治州");
		list.add("新疆省直辖行政单位");
		list.add("恩施土家族苗族自治州");
		list.add("湖北省省直辖行政单位");
		list.add("湘西土家族苗族自治州");
		list.add("黔东南苗族侗族自治州");
		list.add("黔南布依族苗族自治州");
		list.add("红河哈尼族彝族自治州");
		list.add("德宏傣族景颇族自治州");
		list.add("海西蒙古族藏族自治州");
		list.add("黔西南布依族苗族自治州");
		list.add("克孜勒苏柯尔克孜自治州");

		
		return list;
	}
	
}

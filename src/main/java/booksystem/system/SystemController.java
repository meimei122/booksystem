package booksystem.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("system")
public class SystemController {
	
	/**
	 * 系统主页
	 * @return
	 */
	@RequestMapping(value = "system.service", method = RequestMethod.GET)
	public String systemNumPage() {
		return "system/system";
	}
	
	//整体
	@RequestMapping(value = "/getPage.service")
	public String getPage(String path) {
		return path;
	}
	
	/**
	 * 病案首页
	 * @return
	 */
	@RequestMapping(value = "mrms.service", method = RequestMethod.GET)
	public String mrmsPage() {
		return "mrms/mrms";
	}
	
	/**
	 * 中心介绍-系统主页
	 * @return
	 */
	@RequestMapping(value = "center.service", method = RequestMethod.GET)
	public String centerPage() {
		return "system/centerPage";
	}
	
	/**
	 * 人物介绍-系统主页
	 * @return
	 */
	@RequestMapping(value = "person.service", method = RequestMethod.GET)
	public String personPage() {
		return "system/personPage";
	}
	
	/**
	 * 人物介绍-系统主页
	 * @return
	 */
	@RequestMapping(value = "person2.service", method = RequestMethod.GET)
	public String personPage2() {
		return "system/personPage2";
	}
	
	/**
	 * 发展历程介绍-系统主页
	 * @return
	 */
	@RequestMapping(value = "develop.service", method = RequestMethod.GET)
	public String developPage() {
		return "system/developPage";
	}
	/**
	 * 组织介绍-系统主页
	 * @return
	 */
	@RequestMapping(value = "orgnaization.service", method = RequestMethod.GET)
	public String orgPage() {
		return "system/orgPage";
	}
	/**
	 * 项目介绍-系统主页
	 * @return
	 */
	@RequestMapping(value = "project.service", method = RequestMethod.GET)
	public String projectPage() {
		return "system/projectPage";
	}
	
	
	/**
	 * 中医馆主页
	 * @return
	 */
	@RequestMapping(value = "tcmIndex.service", method = RequestMethod.GET)
	public String tcmIndexPage() {
		return "tcm/tcmIndex";
	}
	
	/**
	 * 中国地图
	 * @return
	 */
	@RequestMapping(value = "chinaMap.service", method = RequestMethod.GET)
	public String chinaMapPage() {
		return "map/chinaMap";
	}
	
	/**
	 * 中医馆--在线人数
	 * @return
	 */
	@RequestMapping(value = "onlineNum.service", method = RequestMethod.GET)
	public String onlineNumPage() {
		return "tcm/onlineNum";
	}
	
	/**
	 * 中医馆--业务数据
	 * @return
	 */
	@RequestMapping(value = "businessData.service", method = RequestMethod.GET)
	public String businessDataPage() {
		return "tcm/businessData";
	}
	
	/**
	 * 中医馆--访问量
	 * @return
	 */
	@RequestMapping(value = "hitViews.service", method = RequestMethod.GET)
	public String hitViewsPage() {
		return "tcm/hitViews";
	}
	
	/**
	 * 中医馆--医生排名
	 * @return
	 */
	@RequestMapping(value = "docRank.service", method = RequestMethod.GET)
	public String docRankPage() {
		return "tcm/docRank";
	}
	
	/**
	 * 中医馆--资源整理
	 * @return
	 */
	@RequestMapping(value = "resourcesInfo.service", method = RequestMethod.GET)
	public String resourcesInfoPage() {
		return "tcm/resourcesInfo";
	}

	/**
	 * 中医馆--资源整理2
	 * @return
	 */
	@RequestMapping(value = "resourcesInfo2.service", method = RequestMethod.GET)
	public String resourcesInfo2Page() {
		return "tcm/resourcesInfo2";
	}
	
	/**
	 * 中医馆--诊疗人次（患者性别年龄）
	 * @return
	 */
	@RequestMapping(value = "patient.service", method = RequestMethod.GET)
	public String patientPage() {
		return "tcm/patient";
	}
	
	/**
	 * 中医馆--进度
	 * @return
	 */
	@RequestMapping(value = "progress.service", method = RequestMethod.GET)
	public String progress() {
		return "tcm/progress";
	}
	
	/**
	 * 中医馆--处方药
	 * @return
	 */
	@RequestMapping(value = "prescriDrug.service", method = RequestMethod.GET)
	public String prescriDrugPage() {
		return "tcm/prescriDrug";
	}
	
	/**
	 * 中医馆--处方费用
	 * @return
	 */
	@RequestMapping(value = "prescriFee.service", method = RequestMethod.GET)
	public String prescriFeePage() {
		return "tcm/prescriFee";
	}
	
	/**
	 * 中医馆--信息化
	 * @return
	 */
	@RequestMapping(value = "informatization.service", method = RequestMethod.GET)
	public String informatizationPage() {
		return "tcm/informatization";
	}
	
	/**
	 * 中医馆--电脑
	 * @return
	 */
	@RequestMapping(value = "computer.service", method = RequestMethod.GET)
	public String computerPage() {
		return "tcm/computer";
	}
	
	
	/**
	 * 中医馆--医生工作站
	 * @return
	 */
	@RequestMapping(value = "docWorkStation.service", method = RequestMethod.GET)
	public String docWorkStationPage() {
		return "tcm/docWorkStation";
	}
	
	/**
	 * 中医馆--中医馆有无
	 * @return
	 */
	@RequestMapping(value = "tcmMuseum.service", method = RequestMethod.GET)
	public String tcmMuseumPage() {
		return "tcm/tcmMuseum";
	}
	
	/**
	 * 中医馆--医院信息化
	 * @return
	 */
	@RequestMapping(value = "hospInfo.service", method = RequestMethod.GET)
	public String hospInfoPage() {
		return "tcm/hospInfo";
	}
	
	/**
	 * 中医馆--HIS厂商
	 * @return
	 */
	@RequestMapping(value = "hisFirms.service", method = RequestMethod.GET)
	public String hisFirmsPage() {
		return "tcm/hisFirms";
	}
	
	/**
	 * 中医馆--网络
	 * @return
	 */
	@RequestMapping(value = "network.service", method = RequestMethod.GET)
	public String networkPage() {
		return "tcm/network";
	}
	
	/**
	 * 中医馆--培训
	 * @return
	 */
	@RequestMapping(value = "train.service", method = RequestMethod.GET)
	public String trainPage() {
		return "tcm/train";
	}
	
	/**
	 * 测试
	 * @return
	 */
	@RequestMapping(value = "test.service", method = RequestMethod.GET)
	public String testPage() {
		return "map/test";
	}
	 
	/**
	 * 中医馆--远程会诊
	 * @return
	 */
	@RequestMapping(value = "consult.service", method = RequestMethod.GET)
	public String consultPage() {
		return "tcm/consult";
	}
	
	/**
	 * 中医馆--中医体质测评
	 * @return
	 */
	@RequestMapping(value = "prevent.service", method = RequestMethod.GET)
	public String preventPage() {
		return "tcm/prevent";
	}
	
	/**
	 * 中医馆--辨证论治开方
	 * @return
	 */
	@RequestMapping(value = "treat.service", method = RequestMethod.GET)
	public String treatPage() {
		return "tcm/treat";
	}
	
	/**
	 * 中医馆--远程教育视频
	 * @return
	 */
	@RequestMapping(value = "video.service", method = RequestMethod.GET)
	public String videoPage() {
		return "tcm/video";
	}
	
	/**
	 * 中医馆--辨证论治
	 * @return
	 */
	@RequestMapping(value = "prescri.service", method = RequestMethod.GET)
	public String prescriPage() {
		return "tcm/prescri";
	}
	
	/**
	 * 中医馆--健康门户
	 * @return
	 */
	@RequestMapping(value = "health.service", method = RequestMethod.GET)
	public String healthPage() {
		return "tcm/healthPage";
	}
	
	/**
	 * 中医馆--中医馆数量
	 * @return
	 */
	@RequestMapping(value = "tcmNum.service", method = RequestMethod.GET)
	public String tcmNumPage() {
		return "tcm/tcmNum";
	}
	
	/**
	 * 中医馆--医生数量
	 * @return
	 */
	@RequestMapping(value = "doctorNum.service", method = RequestMethod.GET)
	public String doctorNumPage() {
		return "tcm/doctorNum";
	}
}

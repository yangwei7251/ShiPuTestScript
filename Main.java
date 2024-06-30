package com.mooctest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AndroidKeyCode;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.UnreachableBrowserException;


public class Main {
	
	/**
	 * 所有和AppiumDriver相关的操作都必须写在该函数中
	 * @param driver
	 * @throws InterruptedException 
	 */
	public void test(AppiumDriver driver) throws InterruptedException {
		    	try {
			Thread.sleep(6000);		//等待6s，待应用完全启动
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS); //设置尝试定位控件的最长时间为8s,也就是最多尝试8s
      /*
    	 * 余下的测试逻辑请按照题目要求进行编写
    	 */
    	driver.findElementById("com.jnzc.shipudaquan:id/positive_btn").click();//同意协议
    	driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click(); //点击允许
    	driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click(); //点击允许
    	
    	Thread.sleep(8000);//休眠5秒		
    	driver.findElementById("com.jnzc.shipudaquan:id/close_ad").click();//关闭广告
    	
    	Thread.sleep(1000);
    	driver.findElementById("com.jnzc.shipudaquan:id/home_search").click();//点击搜索框
    	
    	Thread.sleep(1000);
    	driver.findElementById("com.jnzc.shipudaquan:id/name").click();//点击热门搜索第一个关键词
    	
    	Thread.sleep(2000);
    	driver.findElementById("com.jnzc.shipudaquan:id/a_search_title_clear").click();//结束热门搜索
    	
    	Thread.sleep(1000);
    	driver.findElementById("com.jnzc.shipudaquan:id/a_search_default_history_clear").click();//清空搜索历史
    	
    	Thread.sleep(1000);
    	driver.findElementById("com.jnzc.shipudaquan:id/a_search_title_et").sendKeys("红烧肉");//搜索红烧肉
    	
    	Thread.sleep(1000);
    	driver.findElementById("com.jnzc.shipudaquan:id/a_search_title_btn").click();//点击搜索
    	
    	Thread.sleep(1000);
    	driver.findElementById("com.jnzc.shipudaquan:id/a_search_result_name").click();//点进搜索到的第一个结果
    	
    	driver.findElementById("com.jnzc.shipudaquan:id/video_layout").click();//点击红烧肉的图片/视频
    	
    	Thread.sleep(2000);
    	driver.findElementById("com.jnzc.shipudaquan:id/righ_img").click();//点击分享
    	
    	Thread.sleep(3000);
    	driver.findElementByXPath("//android.widget.TextView[@text='QQ空间']").click();//点击分享到QQ空间*/
    	
    	Thread.sleep(3000);
    	driver.findElementById("com.jnzc.shipudaquan:id/righ_img").click();//点击分享
    	
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='QQ']").click();//点击分享到QQ
    	Thread.sleep(8000);
    	driver.sendKeyEvent(AndroidKeyCode.BACK);//不进行QQ登录，返回原界面
    	Thread.sleep(2000);
    	driver.sendKeyEvent(AndroidKeyCode.ENTER);
    	
    	Thread.sleep(2000);
    	driver.findElementById("com.jnzc.shipudaquan:id/righ_img").click();//点击分享
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='信息']").click();//点击信息
    	driver.sendKeyEvent(AndroidKeyCode.BACK);
    	Thread.sleep(2000);
    	driver.sendKeyEvent(AndroidKeyCode.ENTER);
    	Thread.sleep(2000);
    	driver.swipe(534, 175, 534, 1915, 1000);
    	
    	
    	Thread.sleep(1000);
    	driver.findElementById("com.jnzc.shipudaquan:id/righ_img").click();//点击分享
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='复制链接']").click();//点击复制链接
    	
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='开通VIP会员，免费看全部精品名厨视频']").click();//点击开会员
    	
    	Thread.sleep(7000);
    	driver.sendKeyEvent(AndroidKeyCode.BACK);
    	Thread.sleep(1000);
    	driver.sendKeyEvent(AndroidKeyCode.ENTER);//不开会员，返回原界面
    	
    	Thread.sleep(3000);
    	driver.findElementById("com.jnzc.shipudaquan:id/icon_fav").click();//点击收藏
    	
    	Thread.sleep(3000);
    	driver.findElementById("com.jnzc.shipudaquan:id/ic_back").click();//不进行登录，返回原界面
    	
    	Thread.sleep(1000);
    	driver.findElementById("com.jnzc.shipudaquan:id/btn_back").click();//返回搜索红烧肉界面
    	Thread.sleep(1000);
    	driver.findElementById("com.jnzc.shipudaquan:id/back").click();//返回搜索界面
    	Thread.sleep(1000);
    	driver.findElementById("com.jnzc.shipudaquan:id/back").click();//返回首页
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='VIP']").click();//点击下方导航栏中的VIP
    	
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='推荐']").click();//点击VIP页面中的推荐
    	
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='免费体验']").click();//点击VIP页面中的免费体验
    	
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='小白入门']").click();//点击VIP页面中的小白入门
    	
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='快手菜']").click();//点击VIP页面中的快手菜
    	
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='家常菜']").click();//点击VIP页面中的家常菜
     	driver.swipe(937, 246, 515, 250, 1000);//滑动导航栏，使得后续内容可见
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='面点']").click();//点击VIP页面中的面点
    	driver.swipe(937, 246, 515, 250, 1000);//滑动导航栏，使得后续内容可见
    	Thread.sleep(4000);
    	driver.swipe(937, 246, 515, 250, 1000);//滑动导航栏，使得后续内容可见
    	
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='川湘菜']").click();//点击VIP页面中的川湘菜
     	driver.swipe(937, 246, 515, 250, 1000);//滑动导航栏，使得后续内容可见
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='凉菜']").click();//点击VIP页面中的凉菜
     	driver.swipe(937, 246, 515, 250, 1000);//滑动导航栏，使得后续内容可见
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='烘焙西餐']").click();//点击VIP页面中的烘焙西餐
    	

    	
    	Thread.sleep(2000);
    	driver.findElementById("com.jnzc.shipudaquan:id/nav_item4").click();//点击下方导航栏中的分类
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='热门']").click();//点击分类中的热门
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='菜式']").click();//点击分类中的菜式
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='菜系']").click();//点击分类中的菜系
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='特色']").click();//点击分类中的特色
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='烘焙']").click();//点击分类中的烘焙
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='主食']").click();//点击分类中的主食
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='器具']").click();//点击分类中的器具
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='烹饪方式']").click();//点击分类中的烹饪方式
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='口味']").click();//点击分类中的口味
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='场合']").click();//点击分类中的场合
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='节日']").click();//点击分类中的节日
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='食材']").click();//点击分类中的食材
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='肉类']").click();//点击分类中的肉类
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='蛋/奶']").click();//点击分类中的蛋/奶
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='鱼类']").click();//点击分类中的鱼类
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='水产']").click();//点击分类中的水产
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='蔬菜']").click();//点击分类中的蔬菜
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='豆类']").click();//点击分类中的豆类
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='果品类']").click();//点击分类中的果品类
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='五谷杂粮']").click();//点击分类中的五谷杂粮
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='药食']").click();//点击分类中的药食
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='调味品']").click();//点击分类中的调味品
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='其他']").click();//点击分类中的其他
    	
    	Thread.sleep(2000);
    	driver.findElementById("com.jnzc.shipudaquan:id/nav_item5").click();//点击下方导航栏中的我的
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='立即登录']").click();//点击我的中的立即登录
    	
    	Thread.sleep(3000);
    	driver.findElementById("com.jnzc.shipudaquan:id/ic_back").click();//不登录，返回原界面
    	
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='升级为VIP']").click();//点击我的中的升级为VIP
    	Thread.sleep(6000);
    	driver.sendKeyEvent(AndroidKeyCode.BACK);
    	Thread.sleep(2000);
    	driver.sendKeyEvent(AndroidKeyCode.ENTER);//不开会员，返回原界面
    	
    	
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='我的收藏']").click();//点击我的中的我的收藏
    	Thread.sleep(1000);
    	driver.findElementById("com.jnzc.shipudaquan:id/user_dish_golook").click();//点击登录
    	Thread.sleep(2000);
    	driver.findElementById("com.jnzc.shipudaquan:id/ic_back").click();//返回收藏界面
    	Thread.sleep(2000);
    	driver.findElementById("com.jnzc.shipudaquan:id/leftImgBtn").click();//返回原界面
    	
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='浏览记录']").click();//点击我的中的浏览记录
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='红烧肉']").click();//点击浏览记录中的红烧肉
    	Thread.sleep(2000);
    	driver.sendKeyEvent(AndroidKeyCode.BACK);
    	Thread.sleep(2000);
    	driver.sendKeyEvent(AndroidKeyCode.ENTER);//返回浏览记录
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='全部清除']").click();//清空浏览记录
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='清除']").click();//确定清除
    	Thread.sleep(1000);
    	driver.findElementByXPath("//android.widget.TextView[@text='去逛逛']").click();//点击去逛逛
    	Thread.sleep(2000);
    	driver.findElementById("com.jnzc.shipudaquan:id/nav_item5").click();//点击下方导航栏中的我的
    	
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='陛下，赏个好评吧']").click();//点击我的中的陛下，赏个好评吧
    	
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='反馈问题']").click();//点击我的中的反馈问题
    	Thread.sleep(1000);
    	driver.findElementById("com.jnzc.shipudaquan:id/feebback_reply_content").sendKeys("有bug");//输入有bug的反馈
    	driver.findElementById("com.jnzc.shipudaquan:id/feebback_send").click();//点击发送
    	Thread.sleep(1000);
    	driver.findElementById("com.jnzc.shipudaquan:id/feekback_img_choice").click();//选择图片
    	Thread.sleep(1000);
    	driver.findElementById("com.jnzc.shipudaquan:id/category_btn").click();//点击相册
    	driver.findElementByXPath("//android.widget.TextView[@text='images']").click();//点击images
    	driver.findElementById("com.jnzc.shipudaquan:id/image").click();//点击红烧肉的图片
    	driver.findElementById("com.jnzc.shipudaquan:id/btn_back").click();//返回选择图片页面
    	driver.findElementById("com.jnzc.shipudaquan:id/btn_back").click();//返回反馈页面
    	Thread.sleep(2000);
    	driver.findElementById("com.jnzc.shipudaquan:id/leftImgBtn").click();//返回原界面
    	
    
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='隐私政策']").click();//点击我的中的隐私政策
    	Thread.sleep(3000);
    	driver.swipe(520, 820, 520, 370, 1000);//滑动浏览
    	Thread.sleep(2000);
    	driver.findElementById("com.jnzc.shipudaquan:id/leftImgBtn").click();//返回原界面
    	
    	Thread.sleep(2000);
    	driver.findElementByXPath("//android.widget.TextView[@text='用户协议']").click();//点击我的中的用户协议
    	Thread.sleep(2000);
    	driver.swipe(520, 820, 520, 370, 1000);//滑动浏览
    	Thread.sleep(2000);
    	driver.findElementById("com.jnzc.shipudaquan:id/leftImgBtn").click();//返回原界面
    	
    	
   
	}
	
	/**
	 * AppiumDriver的初始化逻辑必须写在该函数中
	 * @return
	 */
	public AppiumDriver initAppiumTest() {
		
		AppiumDriver driver=null;
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apk");
        File app = new File(appDir, "Shipu.apk");
        
        //设置自动化相关参数
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("noSign", "true");
        
        //设置apk路径
        capabilities.setCapability("app", app.getAbsolutePath()); 
        
        //设置app的主包名和主类名
        capabilities.setCapability("appPackage", "com.jnzc.shipudaquan");
        capabilities.setCapability("appActivity", "com.jnzc.shipudaquan.Welcome");
        //设置使用unicode键盘，支持输入中文和特殊字符
        capabilities.setCapability("unicodeKeyboard","true");
        //设置用例执行完成后重置键盘
        capabilities.setCapability("resetKeyboard","true");
        capabilities.setCapability("automationName","UIAutomator2");
        //初始化
        try {
			driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
        return driver;
	}
	
	public void start() throws InterruptedException {
		test(initAppiumTest());
	}
	
	public static void main(String[] args) throws InterruptedException {
		Main main = new Main();
		main.start();
	}
	

}

package gyu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class gyu {
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\chromedriver\\chromedriver.exe";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://land.naver.com/");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[2]/div/div[1]/div[3]/div[1]/div[1]/div")).click();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[1]")).click();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[2]/div/section/div[2]/div/div[1]/div/div/a/span[2]")).click();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(
				By.xpath("/html/body/div[2]/div/section/div[2]/div/div[1]/div/div/div/div[2]/ul/li[1]/label")).click();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"region_filter\"]/div/div/div[2]/ul/li[1]/label")).click();
		// 지역까지 검색
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 아파트 입력
		driver.findElement(
				By.xpath("/html/body/div[2]/div/section/div[2]/div/div[1]/div/div/div/div[3]/ul/li[1]/a/span")).click();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 학군입력
		driver.findElement(By.xpath("/html/body/div[2]/div/section/div[2]/div[2]/div/div[2]/div[2]/div/div/a[2]/span"))
				.click();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/div[2]/div/section/div[2]/div[2]/div/div[2]/div[2]/div/div/a[2]/span"))
				.click();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 이거 긁어야해
		String distance = driver.findElement(By.xpath("//*[@id=\"detailContents5\"]/div/div[1]")).getText();
		System.out.println(distance);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 뒤로가기 해야지
		driver.findElement(By.xpath("//*[@id=\"ct\"]/div[2]/div[2]/div/button")).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 2; i < 30; i++) {
			// 구 선택 열기
			driver.findElement(By.xpath("/html/body/div[2]/div/section/div[2]/div[2]/div[1]/div/div/a/span[2]"))
					.click();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//for (int l = 2; l < 42; l++) {
			// 구 선택
			//for (int j = 1; j < 14; j++) {
				driver.findElement(By.xpath(
						"/html/body/div[2]/div/section/div[2]/div[2]/div[1]/div/div/div/div[2]/ul/li[1]/label"))
						.click();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//for (int k = 1; k < 14; k++) {
					// 동입력
					driver.findElement(
							By.xpath("/html/body/div[2]/div/section/div[2]/div[2]/div[1]/div/div/div/div[2]/ul/li[1]/label"))
							.click();
						
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
						// 아파트 입력
						driver.findElement(
								By.xpath("/html/body/div[2]/div/section/div[2]/div[2]/div[1]/div/div/div/div[3]/ul/li[" + i + "]/a/span")).click();
											
						
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						distance = driver.findElement(By.xpath("//*[@id=\"detailContents5\"]/div/div[1]")).getText();
						System.out.println(distance);
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						// 뒤로가기 해야지
						driver.findElement(By.xpath("//*[@id=\"ct\"]/div[2]/div[2]/div/button")).click();
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				//}
			//}
		//}
	}
}

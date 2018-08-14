import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Acessar site");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Url = "https://iw.claro.com.br/v2/login";
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Guilherme\\Documents\\MEGA\\Udemy\\Curso de Angular\\material de apoio\\chromedriver.exe");
				
				WebDriver browser = new ChromeDriver();
				
				//browser.get("https://automatetheboringstuff.com");
				
				browser.get(Url);
				
				WebElement element = browser.findElement(By.xpath("//*[@id=\"login\"]"));
				
				element.sendKeys("93090930");
					
				element = browser.findElement(By.xpath("//*[@id=\"senha\"]"));
				
				element.sendKeys("Pizza@55");
				
				element = browser.findElement(By.xpath("//*[@id=\"loginBox\"]/table/tbody/tr[5]/td[2]/input"));
				
				element.click();
				
				Url = "https://iw.claro.com.br/v2/eng/relatorio/sitevsetapa";
				
				browser.get(Url);
				
				element = browser.findElement(By.xpath("//*[@id=\"UNNEGOCIO_DIV\"]"));
				
				element.click();
				
				element = browser.findElement(By.xpath("//*[@id=\"COD_UNNEGOCIO_3\"]"));
				
				element.click();
				
				element = browser.findElement(By.xpath("//*[@id=\"btn_UNNEGOCIO_Aplicar\"]"));
				
				element.click();
				
				element = browser.findElement(By.xpath("//*[@id=\"COD_FILA_ATUAL\"]/option[4]"));
				
				element.click();
				
				element = browser.findElement(By.xpath("//*[@id=\"BTN_TEXT_btnCSV\"]"));
				
				element.click();
				
			}
		});
		btnNewButton.setBounds(30, 149, 139, 23);
		frame.getContentPane().add(btnNewButton);
				
		JButton btnNewButton_1 = new JButton("Open");
		btnNewButton_1.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
			
				 String downloadPath = "C:/Users/Guilherme/Downloads";
				
				Desktop desktop= Desktop.getDesktop();	
								
				File file = lastFileModified(downloadPath);
				
				try {
					desktop.open(file);
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
									
				
			}
		});
		btnNewButton_1.setBounds(40, 183, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
	
	public static File lastFileModified(String dir) {
	    File fl = new File(dir);
	    File[] files = fl.listFiles(new FileFilter() {          
	        public boolean accept(File file) {
	            return file.isFile();
	        }
	    });
	    long lastMod = Long.MIN_VALUE;
	    File choice = null;
	    for (File file : files) {
	        if (file.lastModified() > lastMod) {
	            choice = file;
	            lastMod = file.lastModified();
	        }
	    }
	    return choice;
	}
}

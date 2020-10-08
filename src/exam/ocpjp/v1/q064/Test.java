package exam.ocpjp.v1.q064;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Test {
	
//   目錄
//	/company/emp/info.txt
//	/company/emp/benefits/b1.txt
	public static void main(String[] args) {
		
		//line n1
//		stream.forEach(s->System.out.print(s));
//		Which code fragment can be inserted at line n1to enable the code to print only
//		/company/emp?
//		A. Stream<Path> stream = Files.list (Paths.get ("/company"));  //取得company當前目錄下的所有檔案
//		B. Stream<Path> stream = Files.find( //取得company當前目錄的檔案往下一層的資料夾路徑
//		Paths.get ("/company"), 1,
//		(p,b) -> b.isDirectory (), FileVisitOption.FOLLOW_LINKS);
//		C. Stream<Path> stream = Files.walk (Paths.get ("/company")); //走訪所有在company底下的所有目錄的檔案
//		D. Stream<Path> stream = Files.list (Paths.get ("/company/emp")); //取得company/emp 當前目錄的所有檔案
//		Answer: B
	}
}

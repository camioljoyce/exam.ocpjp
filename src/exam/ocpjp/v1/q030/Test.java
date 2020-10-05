package exam.ocpjp.v1.q030;

import java.io.File;
import java.io.IOException;

public class Test {
	public void recDelete (String dirName) throws IOException {
		File[] listOfFiles = new File(dirName).listFiles();
		if (listOfFiles != null && listOfFiles.length >0) {
			for (File aFile : listOfFiles) {
				if (aFile.isDirectory ()) {
					recDelete(aFile.getAbsolutePath());
				} else {
					if (aFile.getName().endsWith(".class"))
					aFile.delete();
				}
			}
		}
	}
	public static void main(String[] args) {
//		Assume that Projects contains subdirectories that contain .class files
//		and is passed as an argument to the recDelete () method when it is
//		invoked.
//		What is the result?
//		A. The method deletes all the .class files in the Projects directory and its subdirectories.
//		B. The method deletes the .class files of the Projects directory only.
//		C. The method executes and does not make any changes to the Projects directory.
//		D. The method throws an IOException.
//		Answer: A

//		程式第8行，會找出dirName這個目錄下的所有檔案(不包括子目錄中的檔案)。
//		程式第10行的for迴圈，會走訪所有檔案。若檔案為目錄，則再用這個目錄遞迴呼叫recDelete方法；
//		若檔案不是目錄，且檔名是「.class」結尾的話，則刪除之。
//
//		所以答案是選項A。
	}

}

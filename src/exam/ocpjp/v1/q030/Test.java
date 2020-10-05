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

//		�{����8��A�|��XdirName�o�ӥؿ��U���Ҧ��ɮ�(���]�A�l�ؿ������ɮ�)�C
//		�{����10�檺for�j��A�|���X�Ҧ��ɮסC�Y�ɮ׬��ؿ��A�h�A�γo�ӥؿ����j�I�srecDelete��k�F
//		�Y�ɮפ��O�ؿ��A�B�ɦW�O�u.class�v�������ܡA�h�R�����C
//
//		�ҥH���׬O�ﶵA�C
	}

}

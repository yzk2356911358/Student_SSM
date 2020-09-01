package com.yzk.hqbx.file;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class Fileupdate {
	public boolean fileupdate(MultipartFile file) {
		// 判断文件是否为空，空则返回失败页面
		if (file.isEmpty()) {
			return false;
		}
		// 获取文件存储路径（绝对路径）
		String path = "C:\\Users\\Msb\\Documents\\workspace-spring-tool-suite-4-4.7.1.RELEASE\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\Student_SSH\\file";
		// 获取原文件名
		String fileName = file.getOriginalFilename();
		// 创建文件实例
		File filePath = new File(path, fileName);
		// 如果文件目录不存在，创建目录
		if (!filePath.getParentFile().exists()) {
			filePath.getParentFile().mkdirs();
			System.out.println("创建目录" + filePath);
		}
		// 写入文件
		try {
			file.transferTo(filePath);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}

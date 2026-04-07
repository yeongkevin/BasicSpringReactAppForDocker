package com.yeongkevin.Basic_SpringApp.log;

import org.springframework.beans.factory.annotation.Value;

public class FileLog {
	@Value("${app.files.output-dir}")
	private String outputDir;
}

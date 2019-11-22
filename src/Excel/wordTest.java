package Excel;

import java.io.FileOutputStream;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2019/08/23 0023
 * @author jiangwenzhu
 * @version 1.0
 */

public class wordTest {

	public static void main(String[] args){
		try {
			XWPFDocument doc = new XWPFDocument(OPCPackage.open("F:\\word\\input.docx"));
			/**
			 * 替换段落中指定的文本
			 */
			String content = "各省、自治区、直辖市人民政府，国务院各部委、各直属机构：为加强社会信用体系建设，深入推进“放管服”改革，进一步发挥信用在创新监管机制、提高监管能力和水平方面的基础性作用，更好激发市场主体活力，推动高质量发展，经国务院同意，现提出如下意见。";
			for (XWPFParagraph p : doc.getParagraphs()) {
				List<XWPFRun> runs = p.getRuns();
				if (runs != null) {
					StringBuilder line = new StringBuilder();
					for (int i = 0 ; i < runs.size() ; i++) {
						//需要替换的文本
						String text = runs.get(i).getText(0);
						line.append(text);

					}

					String pattern = "\\$\\{.*\\}";
					Pattern pattern1 = Pattern.compile(pattern);
					Matcher matcher = pattern1.matcher(line.toString());

					if(matcher.find()){

						int runCount = runs.size();
						for (int i = runCount - 1 ; i >= 0  ; i--) {
							p.removeRun(i);

						}

						String fileValue = matcher.group(0);
						//替换指定的文本

						XWPFRun newRun = p.createRun();
						if (fileValue.equals("${" + "content" + "}")) {
							//替换的时候要注意，setText是有两个参数的
							//第一个是替换的文本，第二个是从哪里开始替换
							//0是替换全部，如果不设置那么默认就是从原文字
							//结尾开始追加
							newRun.setText(content);
						}
						p.addRun(newRun);
					}
				}
			}
			doc.write(new FileOutputStream("F:\\word\\output.docx"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

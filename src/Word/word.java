package word;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2019/08/12 0012
 * @author jiangwenzhu
 * @version 1.0
 */

public class word {

//	private  void in(String inputContent)
//			throws IOException, ParserConfigurationException, TransformerException {
//		XWPFDocument doc = new XWPFDocument();// 创建Word文件
//		XWPFParagraph p = doc.createParagraph();// 新建一个段落
//		p.setAlignment(ParagraphAlignment.CENTER);// 设置段落的对齐方式
//		p.setBorderBottom(Borders.DOUBLE);//设置下边框
//		p.setBorderTop(Borders.DOUBLE);//设置上边框
//		p.setBorderRight(Borders.DOUBLE);//设置右边框
//		p.setBorderLeft(Borders.DOUBLE);//设置左边框
//		XWPFRun r = p.createRun();//创建段落文本
//		r.setText("POI创建的Word段落文本");
//		r.setBold(true);//设置为粗体
//		r.setColor("FF0000");//设置颜色
//		p = doc.createParagraph();// 新建一个段落
//		r = p.createRun();
//		r.setText("POI读写Excel功能强大、操作简单。");
//		FileOutputStream out = new FileOutputStream("E:\\10-50.doc");
//		doc.write(out);
//		out.close();
//
//		// word转html，适用于doc结尾的内容
//		InputStream input = new FileInputStream("E:\\word.doc");// 文件输入流
//		HWPFDocument wordDocument = new HWPFDocument(input);
//		WordToHtmlConverter wordToHtmlConverter = new WordToHtmlConverter(
//				DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument());
////		wordToHtmlConverter.setPicturesManager(new PicturesManager() {
////			public String savePicture(byte[] content, PictureType pictureType, String suggestedName, float widthInches, float heightInches) {
////				return suggestedName;
////			}
////		});
//		wordToHtmlConverter.processDocument(wordDocument);
//		// 获取并输出所有图片
////		List<?> pics = wordDocument.getPicturesTable().getAllPictures();
////		if (pics != null) {
////			for (int i = 0; i < pics.size(); i++) {
////				Picture pic = (Picture) pics.get(i);
////				try {
////					pic.writeImageContent(new FileOutputStream(path + pic.suggestFullFileName())); // 保存图片
////				} catch (FileNotFoundException e) {
////					e.printStackTrace();
////				}
////			}
////		}
//		Document htmlDocument = wordToHtmlConverter.getDocument();
//		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
//		DOMSource domSource = new DOMSource(htmlDocument);
//		StreamResult streamResult = new StreamResult(outStream);
//
//		TransformerFactory tf = TransformerFactory.newInstance();
//		Transformer serializer = tf.newTransformer();
//		serializer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
//		serializer.setOutputProperty(OutputKeys.INDENT, "yes");
//		serializer.setOutputProperty(OutputKeys.METHOD, "html");
//		serializer.transform(domSource, streamResult);
//		outStream.close();
//
//		// word转html 适用于docx
////		OutputStreamWriter outputStreamWriter = null;
////		XWPFDocument document = new XWPFDocument(new FileInputStream("E:\\真实数据.docx"));
////		XHTMLOptions options = XHTMLOptions.create();
//		// 存放图片的文件夹
////		options.setExtractor(new FileImageExtractor(new File(imagePathStr)));
//		// html中图片的路径
////		options.URIResolver(new BasicURIResolver("image"));
////		outputStreamWriter = new OutputStreamWriter(new FileOutputStream("E:\\1703.html"), "utf-8");
////		XHTMLConverter xhtmlConverter = (XHTMLConverter) XHTMLConverter.getInstance();
////		xhtmlConverter.convert(document, outputStreamWriter, options);
//
//		// html 转word
////		String content = new String(outStream.toByteArray());
////		String filterEndTag = content.replace("</body>\r\n</html>","").trim();
////
////		ByteArrayInputStream bais=null;
////		bais = new ByteArrayInputStream (inputContent.toString().getBytes("utf-8"));
////		POIFSFileSystem poifs = new POIFSFileSystem ();
////		DirectoryEntry directory = poifs.getRoot ();
////		directory.createDocument ("WordDocument", bais);
////		FileOutputStream outStream1 = null;
////		outStream1 = new FileOutputStream("E:\\文档内容.docx");
////		poifs.writeFilesystem (outStream1);
////		outStream1.close();
////		bais.close ();
//
//		System.out.print("a");
//
//=======
//	private static void in() throws IOException {
////		XWPFDocument doc = new XWPFDocument();// 创建Word文件
////		XWPFParagraph p = doc.createParagraph();// 新建一个段落
////		p.setAlignment(ParagraphAlignment.CENTER);// 设置段落的对齐方式
////		p.setBorderBottom(Borders.DOUBLE);//设置下边框
////		p.setBorderTop(Borders.DOUBLE);//设置上边框
////		p.setBorderRight(Borders.DOUBLE);//设置右边框
////		p.setBorderLeft(Borders.DOUBLE);//设置左边框
////		XWPFRun r = p.createRun();//创建段落文本
////		r.setText("POI创建的Word段落文本");
////		r.setBold(true);//设置为粗体
////		r.setColor("FF0000");//设置颜色
////		p = doc.createParagraph();// 新建一个段落
////		r = p.createRun();
////		r.setText("POI读写Excel功能强大、操作简单。");
////		FileOutputStream out = new FileOutputStream("E:\\10-50.doc");
////		doc.write(out);
////		out.close();
//
//	}
//
//	public static void main(String[] args)throws IOException, ParserConfigurationException, TransformerException {
//
//		StringBuilder stringBuilder = new StringBuilder();
//		stringBuilder.append("<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-align: justify\">\n"
//				+ "    各省、自治区、直辖市人民政府，国务院各部委、各直属机构：\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    为加强社会信用体系建设，深入推进“放管服”改革，进一步发挥信用在创新监管机制、提高监管能力和水平方面的基础性作用，更好激发市场主体活力，推动高质量发展，经国务院同意，现提出如下意见。\n"
//				+ "</p>\n"
//				+ "<p style=\"text-align: center\">\n"
//				+ "    <img src=\"http://192.168.200.170/webpic/W0201908/W020190823/W020190823400131831093.jpg\" title=\"政府1.jpg\" alt=\"政府1.jpg\"/>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-weight: bold\"></span>\n"
//				+ "</p>\n"
//				+ "<p class=\"insertfileTag\" style=\"line-height: 16px;\">\n"
//				+ "    <img style=\"vertical-align: middle; margin-right: 2px;\" src=\"http://192.168.200.170/webpic/W0201908/W020190823/W020190823400132052568.gif\"/><a style=\"font-size:12px; color:#0066cc;\" appendix=\"true\" otheroperation=\"false\" href=\"/protect/P0201908/P020190823/P020190823400132823081.jpg\" title=\"测试.jpg\">测试.jpg</a>\n"
//				+ "</p>\n"
//				+ "<p class=\"insertfileTag\" style=\"line-height: 16px;\">\n"
//				+ "    <img style=\"vertical-align: middle; margin-right: 2px;\" src=\"http://192.168.200.170/webpic/W0201908/W020190823/W020190823400132411576.gif\"/><a style=\"font-size:12px; color:#0066cc;\" appendix=\"true\" otheroperation=\"false\" href=\"/protect/P0201908/P020190823/P020190823400132888670.xls\" title=\"DOCUMENT20190823397886439618.xls\">DOCUMENT20190823397886439618.xls</a>\n"
//				+ "</p>\n"
//				+ "<p class=\"insertfileTag\" style=\"line-height: 16px;\">\n"
//				+ "    <img style=\"vertical-align: middle; margin-right: 2px;\" src=\"http://192.168.200.170/webpic/W0201908/W020190823/W020190823400132477326.gif\"/><a style=\"font-size:12px; color:#0066cc;\" appendix=\"true\" otheroperation=\"false\" href=\"/protect/P0201908/P020190823/P020190823400132908148.doc\" title=\"2017年度固原市住房和城乡建设局部门决算（汇总）.doc\">2017年度固原市住房和城乡建设局部门决算（汇总）.doc</a>\n"
//				+ "</p>\n"
//				+ "<p class=\"insertfileTag\" style=\"line-height: 16px;\">\n"
//				+ "    <img style=\"vertical-align: middle; margin-right: 2px;\" src=\"http://192.168.200.170/webpic/W0201908/W020190823/W020190823400132539063.gif\"/><a style=\"font-size:12px; color:#0066cc;\" appendix=\"true\" otheroperation=\"false\" href=\"/protect/P0201908/P020190823/P020190823400133184506.zip\" title=\"ST20190823362757595739.zip\">ST20190823362757595739.zip</a>\n"
//				+ "</p>\n"
//				+ "<p class=\"insertfileTag\" style=\"line-height: 16px;\">\n"
//				+ "    <img style=\"vertical-align: middle; margin-right: 2px;\" src=\"http://192.168.200.170/webpic/W0201908/W020190823/W020190823400132632681.gif\"/><a style=\"font-size:12px; color:#0066cc;\" appendix=\"true\" otheroperation=\"false\" href=\"/protect/P0201908/P020190823/P020190823400133408789.mp4\" title=\"000h0wr7lx07nG6cUtqo01040200YDg40k010.mp4\">000h0wr7lx07nG6cUtqo01040200YDg40k010.mp4</a>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-weight: bold\"><br/></span><br/>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-weight: bold\">一、总体要求</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    以习近平新时代中国特色社会主义思想为指导，深入贯彻落实党的十九大和十九届二中、三中全会精神，按照依法依规、改革创新、协同共治的基本原则，以加强信用监管为着力点，创新监管理念、监管制度和监管方式，建立健全贯穿市场主体全生命周期，衔接事前、事中、事后全监管环节的新型监管机制，不断提升监管能力和水平，进一步规范市场秩序，优化营商环境，推动高质量发展。\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-weight: bold\">二、创新事前环节信用监管</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（一）建立健全信用承诺制度。</span><span style=\";padding: 0px\">在办理适用信用承诺制的行政许可事项时，申请人承诺符合审批条件并提交有关材料的，应予即时办理。申请人信用状况较好、部分申报材料不齐备但书面承诺在规定期限内提供的，应先行受理，加快办理进度。书面承诺履约情况记入信用记录，作为事中、事后监管的重要依据，对不履约的申请人，视情节实施惩戒。要加快梳理可开展信用承诺的行政许可事项，制定格式规范的信用承诺书，并依托各级信用门户网站向社会公开。鼓励市场主体主动向社会作出信用承诺。支持行业协会商会建立健全行业内信用承诺制度，加强行业自律。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（各地区各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（二）探索开展经营者准入前诚信教育。</span><span style=\";padding: 0px\">充分利用各级各类政务服务窗口，广泛开展市场主体守法诚信教育。为市场主体办理注册、审批、备案等相关业务时，适时开展标准化、规范化、便捷化的法律知识和信用知识教育，提高经营者依法诚信经营意识。开展诚信教育不得收费，也不得作为市场准入的必要条件。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（各地区各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（三）积极拓展信用报告应用。</span><span style=\";padding: 0px\">鼓励各类市场主体在生产经营活动中更广泛、主动地应用信用报告。在政府采购、招标投标、行政审批、市场准入、资质审核等事项中，充分发挥公共信用服务机构和第三方信用服务机构出具的信用报告作用。探索建立全国统一的信用报告标准，推动信用报告结果实现异地互认。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（发展改革委、人民银行牵头，各地区各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-weight: bold\">三、加强事中环节信用监管</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（四）全面建立市场主体信用记录。</span><span style=\";padding: 0px\">根据权责清单建立信用信息采集目录，在办理注册登记、资质审核、日常监管、公共服务等过程中，及时、准确、全面记录市场主体信用行为，特别是将失信记录建档留痕，做到可查可核可溯。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（各地区各部门按职责分别负责）</span><span style=\";padding: 0px\">完善法人和非法人组织统一社会信用代码制度，以统一社会信用代码为标识，整合形成完整的市场主体信用记录，并通过“信用中国”网站、国家企业信用信息公示系统或中国政府网及相关部门门户网站等渠道依法依规向社会公开。完成12315市场监管投诉举报热线和信息化平台整合工作，大力开展消费投诉公示，促进经营者落实消费维权主体责任。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（发展改革委、市场监管总局负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（五）建立健全信用信息自愿注册机制。</span><span style=\";padding: 0px\">鼓励市场主体在“信用中国”网站或其他渠道上自愿注册资质证照、市场经营、合同履约、社会公益等信用信息，并对信息真实性公开作出信用承诺，授权网站对相关信息进行整合、共享与应用。经验证的自愿注册信息可作为开展信用评价和生成信用报告的重要依据。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（发展改革委牵头，各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（六）深入开展公共信用综合评价。</span><span style=\";padding: 0px\">全国信用信息共享平台要加强与相关部门的协同配合，依法依规整合各类信用信息，对市场主体开展全覆盖、标准化、公益性的公共信用综合评价，定期将评价结果推送至相关政府部门、金融机构、行业协会商会参考使用，并依照有关规定向社会公开。推动相关部门利用公共信用综合评价结果，结合部门行业管理数据，建立行业信用评价模型，为信用监管提供更精准的依据。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（发展改革委牵头，各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（七）大力推进信用分级分类监管。</span><span style=\";padding: 0px\">在充分掌握信用信息、综合研判信用状况的基础上，以公共信用综合评价结果、行业信用评价结果等为依据，对监管对象进行分级分类，根据信用等级高低采取差异化的监管措施。“双随机、一公开”监管要与信用等级相结合，对信用较好、风险较低的市场主体，可合理降低抽查比例和频次，减少对正常生产经营的影响；对信用风险一般的市场主体，按常规比例和频次抽查；对违法失信、风险较高的市场主体，适当提高抽查比例和频次，依法依规实行严管和惩戒。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（各地区各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-weight: bold\">四、完善事后环节信用监管</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（八）健全失信联合惩戒对象认定机制。</span><span style=\";padding: 0px\">有关部门依据在事前、事中监管环节获取并认定的失信记录，依法依规建立健全失信联合惩戒对象名单制度。以相关司法裁判、行政处罚、行政强制等处理结果为依据，按程序将涉及性质恶劣、情节严重、社会危害较大的违法失信行为的市场主体纳入失信联合惩戒对象名单。加快完善相关管理办法，明确认定依据、标准、程序、异议申诉和退出机制。制定管理办法要充分征求社会公众意见，出台的标准及其具体认定程序以适当方式向社会公开。支持有关部门根据监管需要建立重点关注对象名单制度，对存在失信行为但严重程度尚未达到失信联合惩戒对象认定标准的市场主体，可实施与其失信程度相对应的严格监管措施。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（九）督促失信市场主体限期整改。</span><span style=\";padding: 0px\">失信市场主体应当在规定期限内认真整改，整改不到位的，按照“谁认定、谁约谈”的原则，由认定部门依法依规启动提示约谈或警示约谈程序，督促失信市场主体履行相关义务、消除不良影响。约谈记录记入失信市场主体信用记录，统一归集后纳入全国信用信息共享平台。大力推进重点领域失信问题专项治理，采取有力有效措施加快推进整改。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（十）深入开展失信联合惩戒。</span><span style=\";padding: 0px\">加快构建跨地区、跨行业、跨领域的失信联合惩戒机制，从根本上解决失信行为反复出现、易地出现的问题。依法依规建立联合惩戒措施清单，动态更新并向社会公开，形成行政性、市场性和行业性等惩戒措施多管齐下，社会力量广泛参与的失信联合惩戒大格局。重点实施惩戒力度大、监管效果好的失信惩戒措施，包括依法依规限制失信联合惩戒对象股票发行、招标投标、申请财政性资金项目、享受税收优惠等行政性惩戒措施，限制获得授信、乘坐飞机、乘坐高等级列车和席次等市场性惩戒措施，以及通报批评、公开谴责等行业性惩戒措施。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（发展改革委牵头，各地区各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（十一）坚决依法依规实施市场和行业禁入措施。</span><span style=\";padding: 0px\">以食品药品、生态环境、工程质量、安全生产、养老托幼、城市运行安全等与人民群众生命财产安全直接相关的领域为重点，实施严格监管，加大惩戒力度。对拒不履行司法裁判或行政处罚决定、屡犯不改、造成重大损失的市场主体及其相关责任人，坚决依法依规在一定期限内实施市场和行业禁入措施，直至永远逐出市场。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（发展改革委牵头，各地区各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（十二）依法追究违法失信责任。</span><span style=\";padding: 0px\">建立健全责任追究机制，对被列入失信联合惩戒对象名单的市场主体，依法依规对其法定代表人或主要负责人、实际控制人进行失信惩戒，并将相关失信行为记入其个人信用记录。机关事业单位、国有企业出现违法失信行为的，要通报上级主管单位和审计部门；工作人员出现违法失信行为的，要通报所在单位及相关纪检监察、组织人事部门。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（各地区各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（十三）探索建立信用修复机制。</span><span style=\";padding: 0px\">失信市场主体在规定期限内纠正失信行为、消除不良影响的，可通过作出信用承诺、完成信用整改、通过信用核查、接受专题培训、提交信用报告、参加公益慈善活动等方式开展信用修复。修复完成后，各地区各部门要按程序及时停止公示其失信记录，终止实施联合惩戒措施。加快建立完善协同联动、一网通办机制，为失信市场主体提供高效便捷的信用修复服务。鼓励符合条件的第三方信用服务机构向失信市场主体提供信用报告、信用管理咨询等服务。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（发展改革委牵头，各地区各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-weight: bold\">五、强化信用监管的支撑保障</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（十四）着力提升信用监管信息化建设水平。</span><span style=\";padding: 0px\">充分发挥全国信用信息共享平台和国家“互联网+监管”系统信息归集共享作用，对政府部门信用信息做到“应归尽归”，推进地方信用信息平台、行业信用信息系统互联互通，畅通政企数据流通机制，形成全面覆盖各地区各部门、各类市场主体的信用信息“一张网”。依托全国信用信息共享平台和国家“互联网+监管”系统，将市场主体基础信息、执法监管和处置信息、失信联合惩戒信息等与相关部门业务系统按需共享，在信用监管等过程中加以应用，支撑形成数据同步、措施统一、标准一致的信用监管协同机制。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（发展改革委、国务院办公厅牵头，各地区各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（十五）大力推进信用监管信息公开公示。</span><span style=\";padding: 0px\">在行政许可、行政处罚信息集中公示基础上，依托“信用中国”网站、中国政府网或其他渠道，进一步研究推动行政强制、行政确认、行政征收、行政给付、行政裁决、行政补偿、行政奖励和行政监督检查等其他行政行为信息7个工作日内上网公开，推动在司法裁判和执行活动中应当公开的失信被执行人、虚假诉讼失信人相关信息通过适当渠道公开，做到“应公开、尽公开”。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（各地区各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（十六）充分发挥“互联网+”、大数据对信用监管的支撑作用。</span><span style=\";padding: 0px\">依托国家“互联网+监管”等系统，有效整合公共信用信息、市场信用信息、投诉举报信息和互联网及第三方相关信息，充分运用大数据、人工智能等新一代信息技术，实现信用监管数据可比对、过程可追溯、问题可监测。鼓励各地区各部门结合实际，依法依规与大数据机构合作开发信用信息，及时动态掌握市场主体经营情况及其规律特征。充分利用国家“互联网+监管”等系统建立风险预判预警机制，及早发现防范苗头性和跨行业跨区域风险。运用大数据主动发现和识别违法违规线索，有效防范危害公共利益和群众生命财产安全的违法违规行为。鼓励通过物联网、视联网等非接触式监管方式提升执法监管效率，实现监管规范化、精准化、智能化，减少人为因素，实现公正监管，杜绝随意检查、多头监管等问题，实现“进一次门、查多项事”，减少对监管对象的扰动。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（国务院办公厅、发展改革委、市场监管总局牵头，各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（十七）切实加大信用信息安全和市场主体权益保护力度。</span><span style=\";padding: 0px\">严肃查处违规泄露、篡改信用信息或利用信用信息谋私等行为。加强信用信息安全基础设施和安全防护能力建设。建立健全信用信息异议投诉制度，对市场主体提出异议的信息，信息提供和采集单位要尽快核实并反馈结果，经核实有误的信息要及时予以更正或撤销。因错误认定失信联合惩戒对象名单、错误采取失信联合惩戒措施损害市场主体合法权益的，有关部门和单位要积极采取措施消除不良影响。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（各地区各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（十八）积极引导行业组织和信用服务机构协同监管。</span><span style=\";padding: 0px\">支持有关部门授权的行业协会商会协助开展行业信用建设和信用监管，鼓励行业协会商会建立会员信用记录，开展信用承诺、信用培训、诚信宣传、诚信倡议等，将诚信作为行规行约重要内容，引导本行业增强依法诚信经营意识。推动征信、信用评级、信用保险、信用担保、履约担保、信用管理咨询及培训等信用服务发展，切实发挥第三方信用服务机构在信用信息采集、加工、应用等方面的专业作用。鼓励相关部门与第三方信用服务机构在信用记录归集、信用信息共享、信用大数据分析、信用风险预警、失信案例核查、失信行为跟踪监测等方面开展合作。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（发展改革委、民政部、人民银行按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-weight: bold\">六、加强信用监管的组织实施</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（十九）加强组织领导。</span><span style=\";padding: 0px\">各地区各部门要把构建以信用为基础的新型监管机制作为深入推进“放管服”改革的重要举措，摆在更加突出的位置，加强组织领导，细化责任分工，有力有序有效推动落实。完善信用监管的配套制度，并加强与其他“放管服”改革事项的衔接。负有市场监管、行业监管职责的部门要切实承担行业信用建设和信用监管的主体责任，充分发挥行业组织、第三方信用服务机构作用，为公众监督创造有利条件，整合形成全社会共同参与信用监管的强大合力。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（发展改革委牵头，各地区各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（二十）开展试点示范。</span><span style=\";padding: 0px\">围绕信用承诺、信用修复、失信联合惩戒、信用大数据开发利用等重点工作，组织开展信用建设和信用监管试点示范。在各地区各部门探索创新的基础上，及时总结、提炼、交流开展信用建设和信用监管的好经验、好做法，在更大范围复制推广。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（发展改革委牵头，各地区各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（二十一）加快建章立制。</span><span style=\";padding: 0px\">推动制定社会信用体系建设相关法律，加快研究出台公共信用信息管理条例、统一社会信用代码管理办法等法规。建立健全全国统一的信用监管规则和标准，及时出台相关地方性法规、政府规章或规范性文件，将信用监管中行之有效的做法上升为制度规范。抓紧制定开展信用监管急需的国家标准。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（发展改革委、司法部牵头，各地区各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    <span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（二十二）做好宣传解读。</span><span style=\";padding: 0px\">各地区各部门要通过各种渠道和形式，深入细致向市场主体做好政策宣传解读工作，让经营者充分理解并积极配合以信用为基础的新型监管措施。加强对基层和一线监管人员的指导和培训。组织新闻媒体广泛报道，积极宣传信用监管措施及其成效，营造良好社会氛围。</span><span style=\";padding: 0px;font-family: 楷体, 楷体_GB2312\">（发展改革委牵头，各地区各部门按职责分别负责）</span>\n"
//				+ "</p>\n"
//				+ "<p style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-align: right\">\n"
//				+ "    国务院办公厅 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\n"
//				+ "</p>\n"
//				+ "<p style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-align: right\">\n"
//				+ "    2019年7月9日&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n"
//				+ "</p>\n"
//				+ "<p align=\"\" style=\";padding: 0px;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em;text-align: justify\">\n"
//				+ "    （此件公开发布）\n"
//				+ "</p>\n"
//				+ "<p>\n"
//				+ "    <br/>\n"
//				+ "</p>");
//
//		word word = new word();
//		word.in(stringBuilder.toString());
//	}
}

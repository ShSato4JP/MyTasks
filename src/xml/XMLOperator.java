package xml;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.xml.sax.SAXException;

public class XMLOperator {

	private String filePath;
	private Document XMLDoc; //読み込みデータ

	public XMLOperator(String path) throws SAXException, IOException, DocumentException{
		SAXReader saxReader = new SAXReader();
		XMLDoc = saxReader.read(path);
		filePath = path;
	}

	//新規Nodeの作成
	public void addNode() throws DocumentException, IOException {
		Element rootNode = XMLDoc.getRootElement();
		List rootNodeList = rootNode.elements("taskno");

		//test

		/*Element hoge = (Element) rootNodeList.get(rootNodeList.size() - 2);
		Element hoge2 = hoge.addElement("HogeNode");
		hoge2.setText("hello");
		hoge2.addAttribute("aaa", "bbb");
		Element tmp2 = DocumentHelper.createElement("person");//element作成
		tmp2.setText("tmp2");
		rootNodeList.add(tmp2);
		writeXMLDoc();*/
	}

	public void updateNode() {
	}

	public void deleteNode() {
	}

	//XMLファイルをfilePathへ書き込む
	private void writeXMLDoc() throws IOException {
		StringWriter strWriter = new StringWriter();
		OutputFormat outFormat = new OutputFormat("  ", true, "utf8");
		XMLWriter xmlWriter = new XMLWriter(strWriter, outFormat);
		xmlWriter.write(XMLDoc);

		String outData = removeNewLine(strWriter.toString());

		FileWriter fileWriter = new FileWriter(filePath);
		fileWriter.write(outData);
		fileWriter.close();
	}

	//無駄な改行を取り除く
	private String removeNewLine(String target) throws IOException {
		String result = "";

		if(target == null || target.length() == 0) {
			return result;
		}

		BufferedReader br = new BufferedReader(new StringReader(target));
		String line = null;
		while((line = br.readLine()) != null) {
			if(line.contains("<")) result += line + "\n";
		}

		return result;
	}
}

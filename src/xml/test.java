package xml;

public class test {

	public static void main(String[] args) {
        try {
        	XMLOperator xmlOpe = new XMLOperator("xml/test.xml");
        	xmlOpe.addNode();
        	System.out.println("");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}

package pdfStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import at.knowcenter.code.api.pdf.TableRegion;

public class PDF {
	public List<Paragraph> body_and_heading;
	public Map<TableRegion, String> htmlTables = new HashMap<TableRegion, String>();
	public PDF() {
		body_and_heading = new ArrayList<Paragraph>();
	}

}
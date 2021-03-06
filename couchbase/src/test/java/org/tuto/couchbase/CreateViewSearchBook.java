package org.tuto.couchbase;

import com.couchbase.client.CouchbaseClient;
import com.couchbase.client.protocol.views.DesignDocument;
import com.couchbase.client.protocol.views.ViewDesign;
import org.junit.Test;

public class CreateViewSearchBook {

	 @Test
	    public void createViewSearchBook() throws Exception {
	 
	        CouchbaseClient client = CouchbaseConnection.newCouchbaseClient();
	 
	        // Create books index
	        DesignDocument designDoc = new DesignDocument("bookDoc");
	        String viewName = "searchBook";
	        String mapFunction =
	                        "function (doc, meta) {\n" +
	                        "  if(meta.id.indexOf('book_') == 0) {\n" +
	                        "    emit(parseInt(doc.date.substring(0,4)),[doc.author,doc.title]);\n" +
	                        "  }\n" +
	                        "}";
	        String reduceFunction = "";
	        ViewDesign viewDesign = new ViewDesign(viewName, mapFunction, reduceFunction);
	        designDoc.getViews().add(viewDesign);
	        client.createDesignDoc(designDoc);
	 
	    }
}

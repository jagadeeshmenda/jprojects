import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

//import GoogleResults.Result;

import com.google.gson.Gson;


public class GoogleSearch {

	public void   search(String search ) {
	   
	    // Show title and URL of 1st result.
		
		GoogleResults results = getSearchResults(search + "&start=0");
//	    return results ; 
		System.out.println("call success");
	    int pageSize = results.getResponseData().getCursor().getPages().size();
	    System.out.println("Page SIZE : "  + pageSize);
	    ArrayList urlList  =  new ArrayList () ; 
	    
	    urlList.addAll(getAllURLInCurrentJson(results));
	    int pageCount = 0 ;
	    String indx = results.getResponseData().getCursor().getCurrentPageIndex() ;
	    int currentPageIndex = Integer.parseInt ((indx != null ? indx : "0"));
	    System.out.println("current  - " + currentPageIndex);
	    while (currentPageIndex <=  pageSize) {
		    pageCount = pageCount + 3;
		    String url = search + "&start="+pageCount ; 
		    System.out.println(url);
	    	GoogleResults Oresults = getSearchResults(url);
	    	System.out.println(Oresults);
	    	indx = Oresults.getResponseData().getCursor().getCurrentPageIndex() ;
	    	System.out.println("current  - " + currentPageIndex);
	    	currentPageIndex = Integer.parseInt ((indx != null ? indx : "0"));
	    	if ( Oresults.getResponseData() == null ) {
	    		break;
	    	}
	    	urlList.addAll(getAllURLInCurrentJson(Oresults));
	    }
	    for (Object obj : urlList ) {
	    	int sq = 0 ; 
	    	System.out.println(++sq + " - " + obj);
	    	
	    }
	}
	public GoogleResults getSearchResults (String search)  {
		GoogleResults results = null;
		 String google = "http://ajax.googleapis.com/ajax/services/search/web?v=6.0&q=";
		    String charset = "UTF-8";
		    
		    try  {
//		    	System.out.println(google + search);
		    URL url = new URL(google + URLEncoder.encode(search,charset ));
		    Reader reader = new InputStreamReader(url.openStream(), charset);
		    results = new Gson().fromJson(reader, GoogleResults.class);
		    System.out.println("Sent results ");
		    }catch (Exception ex ) {
		    	System.out.println("Errr "+ ex);
		    }

		return results ;
	}
	private ArrayList getAllURLInCurrentJson (GoogleResults results ) {
		ArrayList al = new ArrayList () ;
		 if (results.getResponseData() != null ){
		for (int i = 0 ; i < results.getResponseData().getResults().size() ; i++ ) {
//	    	System.out.print(results.getResponseData().getResults().get(i).getTitle() + " - ");
//			System.out.println(results.getResponseData().getResults().get(i).getUrl());
	    	al.add(results.getResponseData().getResults().get(i).getUrl());
	    }
		 }
		return al;
	}
	public static void main (String args [] )  { 
		String searchString = "test" ;
		GoogleSearch gs = new GoogleSearch () ;
		try  { 
			gs.search (searchString ) ;
		
		}catch (Exception ex)  {
			ex.printStackTrace();
		}
	}
}

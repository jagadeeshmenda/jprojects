import java.util.List;

public class GoogleResults {


    private ResponseData responseData;
//    private 
    public ResponseData getResponseData() { 
    	return responseData; 
    }
    public void setResponseData(ResponseData responseData) {
    	this.responseData = responseData; 
   }
    public String toString() { return "ResponseData[" + responseData + "]"; }

    static class ResponseData {
    	private Cursor cursor; 
    	public void setCursor (Cursor cursor) {
    		this.cursor = cursor ; 
    	}
    	public Cursor  getCursor () {
    		return this.cursor ; 
    	}
        private List<Result> results;
        public List<Result> getResults() { return results; }
        public void setResults(List<Result> results) { this.results = results; }
        public String toString() { return "Results[" + results + "]"; }
    }

    static class Result {
        private String url;
        private String title;
        public String getUrl() { return url; }
        public String getTitle() { return title; }
        public void setUrl(String url) { this.url = url; }
        public void setTitle(String title) { this.title = title; }
        public String toString() { return "Result[url:" + url +",title:" + title + "]"; }
    }
    static class Page {
    	private String start ;
    	private String label ; 
    	public void setStart (String start) {
    		this.start = start;
    	}
    	public String getStart() { 
    		return this.start;
    	}
    	public void setLable (String label) {
    		this.label = label;
    	}
    	public String getLable() { 
    		return this.label;
    	}
    }
    static class Cursor {
    	private String currentPageIndex; 
    	public String getCurrentPageIndex () { 
    		return this.currentPageIndex ;
    	}
    	public void setCurrentPageIndex (String currentPageIndex) {
    		this.currentPageIndex  = currentPageIndex;
    	}
    	private List<Page> pages;
        public List<Page> getPages() { return pages; }
         public void setPages(List<Page> pages) { this.pages = pages; }

    }

}
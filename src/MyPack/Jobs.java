package MyPack;

import java.util.Iterator;
import java.util.List;

public class Jobs {

	private int srNo;
	private String jobName;
	private List<String> postBy;
	
	public Jobs() {
		super();
	}

	public Jobs(int srNo) {
		super();
		this.srNo = srNo;
	}

	public Jobs(String jobName) {
		super();
		this.jobName = jobName;
	}

	public Jobs(List<String> postBy) {
		super();
		this.postBy = postBy;
	}

	public Jobs(int srNo, String jobName) {
		super();
		this.srNo = srNo;
		this.jobName = jobName;
	}

	public Jobs(String jobName, List<String> postBy) {
		super();
		this.jobName = jobName;
		this.postBy = postBy;
	}

	public Jobs(int srNo, String jobName, List<String> postBy) {
		super();
		this.srNo = srNo;
		this.jobName = jobName;
		this.postBy = postBy;
	}
	
	public void JobsInfo(){
		
		System.out.println(srNo+" "+jobName);
		System.out.println("Available Jobs..");
		
		Iterator<String> itr = postBy.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
	}
}

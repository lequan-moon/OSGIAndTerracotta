import org.quartz.Job;
import org.quartz.JobExecutionContext;

class AJob implements Job{
	public void execute(JobExecutionContext exeCtx){
			println "[" + new Date() + "]" + "Job is executing..."
	}
}
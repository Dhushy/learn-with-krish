package designpatterns;

public class HR extends LeaveHandler{
    @Override
    public String applyLeave(Leave leave) {
        if(leave.getNumberOfDays() <= 21){

            if(leave.getEmpTier() <= 3 && !leave.getReason().equals(ReasonType.CASUAL)){
                return "Your leave days has been APPROVED by HR";
            }else{
                return "Your leave request has been DENIED by HR";
            }
        }else{
            return superVisor.applyLeave(leave);
        }
    }

}

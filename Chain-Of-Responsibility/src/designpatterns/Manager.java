package designpatterns;

public class Manager extends LeaveHandler {
    @Override
    public String applyLeave(Leave leave) {
        if (leave.getNumberOfDays() > 21) {

            if (leave.getEmpTier() <= 2 && leave.getReason().equals(ReasonType.MEDICAL)) {
                return "Your leave days has been APPROVED by Manager";
            }
        }
        return "Your leave request has been DENIED by Manager";
    }
}

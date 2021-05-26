package dao.alldo;

/**
 * @author yu
 */
public class ClassDO {
    /**
     * id of the class
     */
    private String id;

    /**
     * date of the class Format:"YYYYMMDD", eg:"20210501"
     */
    private String date;

    /**
     * time of the class Format:"HHMM", eg:"0830"
     */
    private String time;

    /**
     * trainerId of the teacher
     */
    private String trainerId;

    /**
     * CusID of the student
     */
    private String cusId;

    /**
     * represent if the trainer confirm the class
     * == true when has been confirmed, ==false when has not been confirmed
     */
    private String isConfirm;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(String isConfirm) {
        this.isConfirm = isConfirm;
    }
}

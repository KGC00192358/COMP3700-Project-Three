public class UserModel {
    public String userName = "";
    public int userID = -1000;
    public String userPassword = "";
    public String userLevel = "";


    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(userID).append(", ");
        sb.append("\"").append(userName).append("\"").append(",");
        sb.append("\"").append(userPassword).append("\"").append(",");
        sb.append("\"").append(userLevel).append("\"");
        sb.append(")");
        return sb.toString();

    }




}

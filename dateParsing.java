class Result {

    /*
     * Complete the 'reformatDate' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY dates as parameter.
     */

    public static List<String> reformatDate(List<String> dates) {
    // Write your code here
        List<String> res = new ArrayList<String>();
        for(String date : dates){
            String element = "";
            String[] temp = date.split(" ");
            element += temp[2];
            element += "-";
            switch(temp[1]){
                case "Jan":
                    element += "01";
                    break;
                case "Feb":
                    element += "02";
                    break;
                case "Mar":
                    element += "03";
                    break;
                case "Apr":
                    element += "04";
                    break;
                case "May":
                    element += "05";
                    break;
                case "Jun":
                    element += "06";
                    break;
                case "Jul":
                    element += "07";
                    break;
                case "Aug":
                    element += "08";
                    break;
                case "Sep":
                    element += "09";
                    break;
                case "Oct":
                    element += "10";
                    break;
                case "Nov":
                    element += "11";
                    break;
                case "Dec":
                    element += "12";
                    break;
                default:
                    break;
            }
            element += "-";
            String num = "";
            for(char c: temp[0].toCharArray()){
                if(c >= '0' && c<='9')
                    num += c;
            }
            if(Integer.valueOf(num) < 10)
                element += "0";
            element += num;
            res.add(element);
        }
        return res;
    }

}



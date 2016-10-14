public class HandleData {
    int nextNumber = 0;

    public int handleData(InData inData) {
        int numberOfZero = 0;
        int numberOfOne = 0;

        if (inData.getText().equals("End")) {
            System.exit(0);
        }

        if (inData.getText() == null || "".equals(inData.getText())) {
            return nextNumber = 3;
        }

        for (char aChar : inData.getText().toCharArray()) {
            if (aChar == '0') {
                numberOfZero++;
            } else if (aChar == '1') {
                numberOfOne++;
            } else {
                return nextNumber = 3;
            }

        }
        if (numberOfZero % 2 == 0 && numberOfOne % 2 != 0) {
            return nextNumber = 0;
        } else {
            return nextNumber = 1;
        }
    }
}
final class InData {
    private final String text;
    FSM fsm = new FSM();

    public InData(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void handlingData(InData inData) {
        int numberOfZero = 0;
        int numberOfOne = 0;
        String sum = "";
        // mem.add(inData.getText());

        /*for (String s : mem) {
            sum += s;
        }
*/

        if (inData.getText().equals("End")) {
            System.exit(0);
        }

        if ("".equals(inData.getText())) {
fsm.change_status();
            return;
        }

        for (char aChar : inData.getText().toCharArray()) {
            if (aChar == '0') {
                numberOfZero++;
            } else if (aChar == '1') {
                numberOfOne++;
            } else {
                return;
            }
        }

        if (numberOfZero % 2 == 0 && numberOfOne % 2 != 0) {
            return;
        } else {
            return;
        }
    }
}
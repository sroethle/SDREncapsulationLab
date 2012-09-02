package lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Scott Roethle
 */
public class ItemMaster {

    private final int MAX_RECS = 10;
    private final int NOT_FOUND = -1;

    private int foundIndex = NOT_FOUND;
    private double partPrice;
    private String[] partNums = new String[10];
    private String[] partDescs = new String[10];
    private double[] partPrices = new double[10];
    private int emptyRow;

    public String getPartNums(int i) {
        return partNums[i];
    }

    public String getPartDescs(int i) {
        return partDescs[i];
    }

    public double getPartPrices(int i) {
        return partPrices[i];
    }

    public void sortList() {
        // Only perform the sort if we have records
        if (emptyRow > 0) {
            // Bubble sort routine adapted from sample in text book...
            // Make sure the operations are peformed on all 3 arrays!
            for (int passNum = 1; passNum < emptyRow; passNum++) {
                for (int i = 1; i <= emptyRow - passNum; i++) {
                    String temp = "";
                    temp += partPrices[i - 1];
                    partPrices[i - 1] = partPrices[i];
                    partPrices[i] = Double.parseDouble(temp);

                    temp = partNums[i - 1];
                    partNums[i - 1] = partNums[i];
                    partNums[i] = temp;

                    temp = partDescs[i - 1];
                    partDescs[i - 1] = partDescs[i];
                    partDescs[i] = temp;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Sorry, there are not items to sort", "Sort Error",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public void enterRecord(String partNo, String partDesc, String partPrice) {
        foundIndex = NOT_FOUND;

        try {
            this.partPrice = Double.parseDouble(partPrice);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sorry, the price entry must "
                    + "be a whole or floating point number only.\n "
                    + "Number Format Error.", "NumberFormat Error",
                    JOptionPane.WARNING_MESSAGE);

            return;
        }

        if (emptyRow > MAX_RECS) {
            JOptionPane.showMessageDialog(null,
                    "Sorry, you have reach the maximum of 10 items.\n"
                    + "No more items can be saved.", "Maximum Reached",
                    JOptionPane.WARNING_MESSAGE);

        } else if (partNo.length() == 0 || partDesc.length() == 0
                || partPrice.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Sorry, you must complete all fields. Please try again.",
                    "Incomplete Part Entry", JOptionPane.WARNING_MESSAGE);
            //          this.txtNewProdNo.requestFocus();

        } else {
            partNums[emptyRow] = partNo;
            partDescs[emptyRow] = partDesc;
            partPrices[emptyRow] = this.partPrice;
            this.emptyRow += 1;
        }
    }

    public void updateRecord(String curProdNo, String curDesc, String curPrice) {
        if (foundIndex == NOT_FOUND) {
            JOptionPane.showMessageDialog(null,
                    "Part Number not found. Please try again.",
                    "Search Failure", JOptionPane.WARNING_MESSAGE);
        } else {
            partNums[foundIndex] = curProdNo;
            partDescs[foundIndex] = curDesc;
            partPrices[foundIndex] = Double.parseDouble(curPrice);
            JOptionPane.showMessageDialog(null,
                    "Part updated successfully!",
                    "Success Confirmation", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public String[] getRecord(String searchNum) {
        String[] output = new String[2];
        
        if (searchNum != null && searchNum.length() > 0) {
            for (int i = 0; i < this.partNums.length; i++) {
                if (searchNum.equalsIgnoreCase(partNums[i])) {
                    foundIndex = i;
                    break;
                }
            }
            if (foundIndex != NOT_FOUND) {
                output[0] = partNums[foundIndex];
                output[1] = partDescs[foundIndex];
                output[2] = "" + partPrices[foundIndex];
            }
        }
return output;
    }
}
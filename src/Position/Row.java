package Position;

import static java.lang.String.valueOf;

public class Row {

    private int rowIndex;

    public Row(int rowIndex) {
        setRowIndex(rowIndex);
    }

    public void setRowIndex(int rowIndex) {
        if (rowIndex <= 8 && rowIndex >= 1) {
            this.rowIndex = rowIndex;
        } else {
            throw new IllegalArgumentException("Position.Row index has to be between 1 and 8");
        }
    }

    public String toString() {
        return valueOf(this.rowIndex);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Row row) {
            return this.rowIndex == row.rowIndex;
        } else {
            return false;
        }
    }

    public int getRowIndex() {
        return this.rowIndex;
    }

    public void updateRowIndex(int newRowIndex) {
        setRowIndex(newRowIndex);
    }
}

package Position;

public class Column {

    private char columnIndex;

    public Column(char columnIndex) {
        setColumnIndex(columnIndex);
    }

    private void setColumnIndex(char columnIndex) {
        switch(columnIndex) {
            case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' -> this.columnIndex = columnIndex;
            default -> {
                throw new IllegalArgumentException("Position.Column value has to be A-H");
            }
        };
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Column column) {
            return this.columnIndex == column.columnIndex;
        } else {
            return false;
        }
    }

    public char getColumnIndex() {
        return this.columnIndex;
    }

    public void updateColumnIndex(char newColumnIndex) {
        setColumnIndex(newColumnIndex);
    }
}

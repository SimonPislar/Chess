package Position;

public class Position {

    private Column column;
    private Row row;

    public Position(Column column, Row row) {
        this.column = column;
        this.row = row;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Position pos) {
            return this.column.equals(pos.column) && this.row.equals(pos.row);
        } else {
            return false;
        }
    }

    public Column getColumn() {
        return this.column;
    }

    public Row getRow() {
        return this.row;
    }

    public void updatePosition(Column column, Row row) {
        this.column.updateColumnIndex(column.getColumnIndex());
        this.row.updateRowIndex(row.getRowIndex());
    }

    public void updatePosition(Column column) {
        this.column.updateColumnIndex(column.getColumnIndex());
    }

    public void updatePosition(Row row) {
        this.row.updateRowIndex(row.getRowIndex());
    }
}

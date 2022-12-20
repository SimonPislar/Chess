import Pieces.Bishop;
import Pieces.*;

public interface Visitor {
    public Piece visit(Bishop bishop);
    public Piece visit(King king);
    public Piece visit(Knight knight);
    public Piece visit(Pawn pawn);
    public Piece visit(Queen queen);
    public Piece visit(Rook rook);
}

package eapli.base.warehousemanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;

@Embeddable
public class Location implements ValueObject {
    private static final long serialVersionUID = 1L;
    private long lsquare;
    private long wsquare;

    public Location(final long lsquare, final long wsquare) {
        Preconditions.nonNegative(lsquare, "lenght square must be an integer greater than zero");
        Preconditions.nonNegative(wsquare, "width square must be an integer greater than zero");
        this.lsquare = lsquare;
        this.wsquare = wsquare;
    }

    protected Location() {
        // for ORM
    }

    protected long lSquare() {
        return lsquare;
    }


    protected long wSquare() {
        return wsquare;
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Location location = (Location) o;
        if (lsquare != location.lsquare) {
            return false;
        }
        return wsquare == location.wsquare;
    }

    @Override
    public int hashCode() {
        int result = Math.toIntExact(lsquare);
        result = Math.toIntExact(31L * result + wsquare);
        return result;
    }

}



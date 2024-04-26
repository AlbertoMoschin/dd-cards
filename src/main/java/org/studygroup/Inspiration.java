package org.studygroup;

public enum Inspiration {
    ADD(1), REMOVE(0);

    private final int inspiration;

    Inspiration(int inspiration) {
        this.inspiration = inspiration;
    }

    public int getInspiration() {
        return inspiration;
    }
}

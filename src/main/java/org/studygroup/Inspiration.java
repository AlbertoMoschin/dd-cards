package org.studygroup;

public enum Inspiration {
    ADD(1), REMOVE(0);

    private int inspiration;

    Inspiration(int inspiration) {
        this.inspiration = inspiration;
    }

    public int getInspiration() {
        return inspiration;
    }
}

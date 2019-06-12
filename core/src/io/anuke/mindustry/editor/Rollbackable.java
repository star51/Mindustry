package io.anuke.mindustry.editor;

public interface Rollbackable {
    void undo();
    void redo();
}

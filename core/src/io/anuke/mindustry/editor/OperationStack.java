package io.anuke.mindustry.editor;

import io.anuke.arc.collection.Array;

public class OperationStack{
    private final static int maxSize = 10;
    private Array<Rollbackable> stack = new Array<>();
    private int index = 0;

    public OperationStack(){

    }

    public void clear(){
        stack.clear();
        index = 0;
    }

    public void add(Rollbackable action){
        stack.truncate(stack.size + index);
        index = 0;
        stack.add(action);

        if(stack.size > maxSize){
            stack.remove(0);
        }
    }

    public boolean canUndo(){
        return !(stack.size - 1 + index < 0);
    }

    public boolean canRedo(){
        return !(index > -1 || stack.size + index < 0);
    }

    public Rollbackable undo(){
        if(!canUndo()) return null;

        index--;
        return stack.get(stack.size + index);//.undo();
    }

    public Rollbackable redo(){
        if(!canRedo()) return null;

        index++;
        return stack.get(stack.size + index);//.redo();
    }
}

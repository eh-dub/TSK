package keyboard.presenter;

import keyboard.model.KeyboardModel;
import keyboard.util.Key;
import keyboard.util.KeyLocation;
import keyboard.layout.KeyboardLayout;
import keyboard.layout.BasicKeyboardLayout;

import java.util.Map;
import java.util.List;

public class KeyboardPresenter 
{

    private KeyboardModel model;
    private KeyboardLayout keyLayout;
    private int keyWidth = 30;
    private int keyHeight = 30;
    private int left = 50;
    private int top = 50;

    public KeyboardPresenter( final KeyboardModel model ) 
    {
        this.model = model;
        this.keyLayout = new BasicKeyboardLayout();
        // Initialize state from the model, getting the set of keys.
        // May need to initialize the positioning of each keys here.
    }

    public List<Key> getKeys() 
    {
    	return model.getKeys();
    }
    
    public Map<Key, KeyLocation> getKeyMapping() 
    {
    	return keyLayout.getKeyMapping();
    }
    
    public int getKeyWidth() 
    {
    	return keyWidth;
    }
    
    public int getKeyHeight() 
    {
    	return keyHeight;
    }
    
    public int getLeft() 
    {
    	return left;
    }
    
    public int getTop() 
    {
    	return top;
    }
    
    public void keyPressed( char keyValue ) {
    	if ( keyValue == 15 ) 
    	{
    		model.setShifted( true );
    	} 
    	model.setPressed( keyValue, true );
    }
    
    public void keyReleased( char keyValue ) {
    	if ( keyValue == 15 ) 
    	{
    		model.setShifted( false );
    	}
    	model.setPressed( keyValue, false );
    }
}
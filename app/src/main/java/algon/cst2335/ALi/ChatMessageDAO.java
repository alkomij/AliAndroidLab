package algon.cst2335.ALi;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Dao;
import java.util.List;

public interface ChatMessageDAO {
    @Insert
    void insertMessage(ChatMessage m);
    public List<ChatMessage> getAllMessages();
    @Query("Select * from ChatMessage")
    List<ChatMessage> getAllMessage();

    @Delete
    void deleteMessage(ChatMessage m);

}

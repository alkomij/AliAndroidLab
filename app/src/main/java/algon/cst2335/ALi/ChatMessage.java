package algon.cst2335.ALi;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ChatMessage {
        @ColumnInfo(name="message")
        protected String message;
        @ColumnInfo(name="TimeSent")
        protected String timeSent;

        @ColumnInfo(name="SenderOrReceive")
        protected int sendOrReceive;
@PrimaryKey(autoGenerate=true)
@ColumnInfo(name="id")
public int id;
        public boolean isSentButton;

public ChatMessage (String m, String t, boolean sent)
        {
        message = m;
        timeSent = t;
        isSentButton = sent;
        }

public String getMessage() {
        return message;
        }

public String getTimeSent() {
        return timeSent;
        }

public boolean isSentButton() {
        return isSentButton;
        }
        }
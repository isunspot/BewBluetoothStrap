package com.afa.tourism.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.bozhilun.android.bean.SleepBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SLEEP_BEAN".
*/
public class SleepBeanDao extends AbstractDao<SleepBean, Long> {

    public static final String TABLENAME = "SLEEP_BEAN";

    /**
     * Properties of entity SleepBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property StartTime = new Property(1, String.class, "startTime", false, "START_TIME");
        public final static Property EntTime = new Property(2, String.class, "entTime", false, "ENT_TIME");
        public final static Property Year = new Property(3, int.class, "year", false, "YEAR");
        public final static Property Month = new Property(4, int.class, "month", false, "MONTH");
        public final static Property Day = new Property(5, int.class, "day", false, "DAY");
        public final static Property Hour = new Property(6, int.class, "hour", false, "HOUR");
        public final static Property Minute = new Property(7, int.class, "minute", false, "MINUTE");
        public final static Property Sleep_id = new Property(8, int.class, "sleep_id", false, "SLEEP_ID");
        public final static Property Sleep_time = new Property(9, int.class, "sleep_time", false, "SLEEP_TIME");
        public final static Property UserId = new Property(10, String.class, "userId", false, "USER_ID");
        public final static Property AddressMac = new Property(11, String.class, "addressMac", false, "ADDRESS_MAC");
    }


    public SleepBeanDao(DaoConfig config) {
        super(config);
    }
    
    public SleepBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SLEEP_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"START_TIME\" TEXT NOT NULL ," + // 1: startTime
                "\"ENT_TIME\" TEXT NOT NULL ," + // 2: entTime
                "\"YEAR\" INTEGER NOT NULL ," + // 3: year
                "\"MONTH\" INTEGER NOT NULL ," + // 4: month
                "\"DAY\" INTEGER NOT NULL ," + // 5: day
                "\"HOUR\" INTEGER NOT NULL ," + // 6: hour
                "\"MINUTE\" INTEGER NOT NULL ," + // 7: minute
                "\"SLEEP_ID\" INTEGER NOT NULL ," + // 8: sleep_id
                "\"SLEEP_TIME\" INTEGER NOT NULL ," + // 9: sleep_time
                "\"USER_ID\" TEXT NOT NULL ," + // 10: userId
                "\"ADDRESS_MAC\" TEXT NOT NULL );"); // 11: addressMac
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SLEEP_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, SleepBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getStartTime());
        stmt.bindString(3, entity.getEntTime());
        stmt.bindLong(4, entity.getYear());
        stmt.bindLong(5, entity.getMonth());
        stmt.bindLong(6, entity.getDay());
        stmt.bindLong(7, entity.getHour());
        stmt.bindLong(8, entity.getMinute());
        stmt.bindLong(9, entity.getSleep_id());
        stmt.bindLong(10, entity.getSleep_time());
        stmt.bindString(11, entity.getUserId());
        stmt.bindString(12, entity.getAddressMac());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, SleepBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getStartTime());
        stmt.bindString(3, entity.getEntTime());
        stmt.bindLong(4, entity.getYear());
        stmt.bindLong(5, entity.getMonth());
        stmt.bindLong(6, entity.getDay());
        stmt.bindLong(7, entity.getHour());
        stmt.bindLong(8, entity.getMinute());
        stmt.bindLong(9, entity.getSleep_id());
        stmt.bindLong(10, entity.getSleep_time());
        stmt.bindString(11, entity.getUserId());
        stmt.bindString(12, entity.getAddressMac());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public SleepBean readEntity(Cursor cursor, int offset) {
        SleepBean entity = new SleepBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // startTime
            cursor.getString(offset + 2), // entTime
            cursor.getInt(offset + 3), // year
            cursor.getInt(offset + 4), // month
            cursor.getInt(offset + 5), // day
            cursor.getInt(offset + 6), // hour
            cursor.getInt(offset + 7), // minute
            cursor.getInt(offset + 8), // sleep_id
            cursor.getInt(offset + 9), // sleep_time
            cursor.getString(offset + 10), // userId
            cursor.getString(offset + 11) // addressMac
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, SleepBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setStartTime(cursor.getString(offset + 1));
        entity.setEntTime(cursor.getString(offset + 2));
        entity.setYear(cursor.getInt(offset + 3));
        entity.setMonth(cursor.getInt(offset + 4));
        entity.setDay(cursor.getInt(offset + 5));
        entity.setHour(cursor.getInt(offset + 6));
        entity.setMinute(cursor.getInt(offset + 7));
        entity.setSleep_id(cursor.getInt(offset + 8));
        entity.setSleep_time(cursor.getInt(offset + 9));
        entity.setUserId(cursor.getString(offset + 10));
        entity.setAddressMac(cursor.getString(offset + 11));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(SleepBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(SleepBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(SleepBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}

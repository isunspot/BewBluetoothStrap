package com.afa.tourism.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.bozhilun.android.bean.B15PSleepBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "B15_PSLEEP_BEAN".
*/
public class B15PSleepBeanDao extends AbstractDao<B15PSleepBean, Long> {

    public static final String TABLENAME = "B15_PSLEEP_BEAN";

    /**
     * Properties of entity B15PSleepBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property DeviceCode = new Property(1, String.class, "deviceCode", false, "DEVICE_CODE");
        public final static Property UserId = new Property(2, String.class, "userId", false, "USER_ID");
        public final static Property StartTime = new Property(3, String.class, "startTime", false, "START_TIME");
        public final static Property EndTime = new Property(4, String.class, "endTime", false, "END_TIME");
        public final static Property Count = new Property(5, int.class, "count", false, "COUNT");
        public final static Property DeepLen = new Property(6, int.class, "deepLen", false, "DEEP_LEN");
        public final static Property SleepLen = new Property(7, int.class, "sleepLen", false, "SLEEP_LEN");
        public final static Property ShallowLen = new Property(8, int.class, "shallowLen", false, "SHALLOW_LEN");
        public final static Property SleepQuality = new Property(9, int.class, "sleepQuality", false, "SLEEP_QUALITY");
        public final static Property SleepCurveS = new Property(10, String.class, "sleepCurveS", false, "SLEEP_CURVE_S");
        public final static Property SleepCurveP = new Property(11, String.class, "sleepCurveP", false, "SLEEP_CURVE_P");
    }


    public B15PSleepBeanDao(DaoConfig config) {
        super(config);
    }
    
    public B15PSleepBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"B15_PSLEEP_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"DEVICE_CODE\" TEXT NOT NULL ," + // 1: deviceCode
                "\"USER_ID\" TEXT NOT NULL ," + // 2: userId
                "\"START_TIME\" TEXT NOT NULL ," + // 3: startTime
                "\"END_TIME\" TEXT," + // 4: endTime
                "\"COUNT\" INTEGER NOT NULL ," + // 5: count
                "\"DEEP_LEN\" INTEGER NOT NULL ," + // 6: deepLen
                "\"SLEEP_LEN\" INTEGER NOT NULL ," + // 7: sleepLen
                "\"SHALLOW_LEN\" INTEGER NOT NULL ," + // 8: shallowLen
                "\"SLEEP_QUALITY\" INTEGER NOT NULL ," + // 9: sleepQuality
                "\"SLEEP_CURVE_S\" TEXT," + // 10: sleepCurveS
                "\"SLEEP_CURVE_P\" TEXT);"); // 11: sleepCurveP
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"B15_PSLEEP_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, B15PSleepBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getDeviceCode());
        stmt.bindString(3, entity.getUserId());
        stmt.bindString(4, entity.getStartTime());
 
        String endTime = entity.getEndTime();
        if (endTime != null) {
            stmt.bindString(5, endTime);
        }
        stmt.bindLong(6, entity.getCount());
        stmt.bindLong(7, entity.getDeepLen());
        stmt.bindLong(8, entity.getSleepLen());
        stmt.bindLong(9, entity.getShallowLen());
        stmt.bindLong(10, entity.getSleepQuality());
 
        String sleepCurveS = entity.getSleepCurveS();
        if (sleepCurveS != null) {
            stmt.bindString(11, sleepCurveS);
        }
 
        String sleepCurveP = entity.getSleepCurveP();
        if (sleepCurveP != null) {
            stmt.bindString(12, sleepCurveP);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, B15PSleepBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getDeviceCode());
        stmt.bindString(3, entity.getUserId());
        stmt.bindString(4, entity.getStartTime());
 
        String endTime = entity.getEndTime();
        if (endTime != null) {
            stmt.bindString(5, endTime);
        }
        stmt.bindLong(6, entity.getCount());
        stmt.bindLong(7, entity.getDeepLen());
        stmt.bindLong(8, entity.getSleepLen());
        stmt.bindLong(9, entity.getShallowLen());
        stmt.bindLong(10, entity.getSleepQuality());
 
        String sleepCurveS = entity.getSleepCurveS();
        if (sleepCurveS != null) {
            stmt.bindString(11, sleepCurveS);
        }
 
        String sleepCurveP = entity.getSleepCurveP();
        if (sleepCurveP != null) {
            stmt.bindString(12, sleepCurveP);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public B15PSleepBean readEntity(Cursor cursor, int offset) {
        B15PSleepBean entity = new B15PSleepBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // deviceCode
            cursor.getString(offset + 2), // userId
            cursor.getString(offset + 3), // startTime
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // endTime
            cursor.getInt(offset + 5), // count
            cursor.getInt(offset + 6), // deepLen
            cursor.getInt(offset + 7), // sleepLen
            cursor.getInt(offset + 8), // shallowLen
            cursor.getInt(offset + 9), // sleepQuality
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // sleepCurveS
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11) // sleepCurveP
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, B15PSleepBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDeviceCode(cursor.getString(offset + 1));
        entity.setUserId(cursor.getString(offset + 2));
        entity.setStartTime(cursor.getString(offset + 3));
        entity.setEndTime(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCount(cursor.getInt(offset + 5));
        entity.setDeepLen(cursor.getInt(offset + 6));
        entity.setSleepLen(cursor.getInt(offset + 7));
        entity.setShallowLen(cursor.getInt(offset + 8));
        entity.setSleepQuality(cursor.getInt(offset + 9));
        entity.setSleepCurveS(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setSleepCurveP(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(B15PSleepBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(B15PSleepBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(B15PSleepBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
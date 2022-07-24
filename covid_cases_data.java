// ORM class for table 'covid_cases_data'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jul 22 10:22:37 IST 2022
// For connector: org.apache.sqoop.manager.DirectMySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class covid_cases_data extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String date;
  public String get_date() {
    return date;
  }
  public void set_date(String date) {
    this.date = date;
  }
  public covid_cases_data with_date(String date) {
    this.date = date;
    return this;
  }
  private String country;
  public String get_country() {
    return country;
  }
  public void set_country(String country) {
    this.country = country;
  }
  public covid_cases_data with_country(String country) {
    this.country = country;
    return this;
  }
  private Integer confirmed;
  public Integer get_confirmed() {
    return confirmed;
  }
  public void set_confirmed(Integer confirmed) {
    this.confirmed = confirmed;
  }
  public covid_cases_data with_confirmed(Integer confirmed) {
    this.confirmed = confirmed;
    return this;
  }
  private Integer deaths;
  public Integer get_deaths() {
    return deaths;
  }
  public void set_deaths(Integer deaths) {
    this.deaths = deaths;
  }
  public covid_cases_data with_deaths(Integer deaths) {
    this.deaths = deaths;
    return this;
  }
  private Integer recovered;
  public Integer get_recovered() {
    return recovered;
  }
  public void set_recovered(Integer recovered) {
    this.recovered = recovered;
  }
  public covid_cases_data with_recovered(Integer recovered) {
    this.recovered = recovered;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof covid_cases_data)) {
      return false;
    }
    covid_cases_data that = (covid_cases_data) o;
    boolean equal = true;
    equal = equal && (this.date == null ? that.date == null : this.date.equals(that.date));
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.confirmed == null ? that.confirmed == null : this.confirmed.equals(that.confirmed));
    equal = equal && (this.deaths == null ? that.deaths == null : this.deaths.equals(that.deaths));
    equal = equal && (this.recovered == null ? that.recovered == null : this.recovered.equals(that.recovered));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof covid_cases_data)) {
      return false;
    }
    covid_cases_data that = (covid_cases_data) o;
    boolean equal = true;
    equal = equal && (this.date == null ? that.date == null : this.date.equals(that.date));
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.confirmed == null ? that.confirmed == null : this.confirmed.equals(that.confirmed));
    equal = equal && (this.deaths == null ? that.deaths == null : this.deaths.equals(that.deaths));
    equal = equal && (this.recovered == null ? that.recovered == null : this.recovered.equals(that.recovered));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.date = JdbcWritableBridge.readString(1, __dbResults);
    this.country = JdbcWritableBridge.readString(2, __dbResults);
    this.confirmed = JdbcWritableBridge.readInteger(3, __dbResults);
    this.deaths = JdbcWritableBridge.readInteger(4, __dbResults);
    this.recovered = JdbcWritableBridge.readInteger(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.date = JdbcWritableBridge.readString(1, __dbResults);
    this.country = JdbcWritableBridge.readString(2, __dbResults);
    this.confirmed = JdbcWritableBridge.readInteger(3, __dbResults);
    this.deaths = JdbcWritableBridge.readInteger(4, __dbResults);
    this.recovered = JdbcWritableBridge.readInteger(5, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(date, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(confirmed, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(deaths, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recovered, 5 + __off, 4, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(date, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(confirmed, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(deaths, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recovered, 5 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.date = null;
    } else {
    this.date = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.country = null;
    } else {
    this.country = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.confirmed = null;
    } else {
    this.confirmed = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.deaths = null;
    } else {
    this.deaths = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recovered = null;
    } else {
    this.recovered = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date);
    }
    if (null == this.country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country);
    }
    if (null == this.confirmed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.confirmed);
    }
    if (null == this.deaths) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.deaths);
    }
    if (null == this.recovered) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recovered);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date);
    }
    if (null == this.country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country);
    }
    if (null == this.confirmed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.confirmed);
    }
    if (null == this.deaths) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.deaths);
    }
    if (null == this.recovered) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recovered);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(date==null?"null":date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(confirmed==null?"null":"" + confirmed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(deaths==null?"null":"" + deaths, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recovered==null?"null":"" + recovered, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(date==null?"null":date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(confirmed==null?"null":"" + confirmed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(deaths==null?"null":"" + deaths, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recovered==null?"null":"" + recovered, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.date = null; } else {
      this.date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.country = null; } else {
      this.country = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.confirmed = null; } else {
      this.confirmed = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.deaths = null; } else {
      this.deaths = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recovered = null; } else {
      this.recovered = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.date = null; } else {
      this.date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.country = null; } else {
      this.country = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.confirmed = null; } else {
      this.confirmed = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.deaths = null; } else {
      this.deaths = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recovered = null; } else {
      this.recovered = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    covid_cases_data o = (covid_cases_data) super.clone();
    return o;
  }

  public void clone0(covid_cases_data o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("date", this.date);
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("confirmed", this.confirmed);
    __sqoop$field_map.put("deaths", this.deaths);
    __sqoop$field_map.put("recovered", this.recovered);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("date", this.date);
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("confirmed", this.confirmed);
    __sqoop$field_map.put("deaths", this.deaths);
    __sqoop$field_map.put("recovered", this.recovered);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("date".equals(__fieldName)) {
      this.date = (String) __fieldVal;
    }
    else    if ("country".equals(__fieldName)) {
      this.country = (String) __fieldVal;
    }
    else    if ("confirmed".equals(__fieldName)) {
      this.confirmed = (Integer) __fieldVal;
    }
    else    if ("deaths".equals(__fieldName)) {
      this.deaths = (Integer) __fieldVal;
    }
    else    if ("recovered".equals(__fieldName)) {
      this.recovered = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("date".equals(__fieldName)) {
      this.date = (String) __fieldVal;
      return true;
    }
    else    if ("country".equals(__fieldName)) {
      this.country = (String) __fieldVal;
      return true;
    }
    else    if ("confirmed".equals(__fieldName)) {
      this.confirmed = (Integer) __fieldVal;
      return true;
    }
    else    if ("deaths".equals(__fieldName)) {
      this.deaths = (Integer) __fieldVal;
      return true;
    }
    else    if ("recovered".equals(__fieldName)) {
      this.recovered = (Integer) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

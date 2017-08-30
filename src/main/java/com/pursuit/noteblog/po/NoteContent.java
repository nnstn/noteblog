package com.pursuit.noteblog.po;

import java.util.Date;

public class NoteContent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_content.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_content.uid
     *
     * @mbggenerated
     */
    private String uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_content.last_update_time
     *
     * @mbggenerated
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_content.last_updated_uid
     *
     * @mbggenerated
     */
    private String lastUpdatedUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_content.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_content.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_content.id
     *
     * @return the value of note_content.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_content.id
     *
     * @param id the value for note_content.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_content.uid
     *
     * @return the value of note_content.uid
     *
     * @mbggenerated
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_content.uid
     *
     * @param uid the value for note_content.uid
     *
     * @mbggenerated
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_content.last_update_time
     *
     * @return the value of note_content.last_update_time
     *
     * @mbggenerated
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_content.last_update_time
     *
     * @param lastUpdateTime the value for note_content.last_update_time
     *
     * @mbggenerated
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_content.last_updated_uid
     *
     * @return the value of note_content.last_updated_uid
     *
     * @mbggenerated
     */
    public String getLastUpdatedUid() {
        return lastUpdatedUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_content.last_updated_uid
     *
     * @param lastUpdatedUid the value for note_content.last_updated_uid
     *
     * @mbggenerated
     */
    public void setLastUpdatedUid(String lastUpdatedUid) {
        this.lastUpdatedUid = lastUpdatedUid == null ? null : lastUpdatedUid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_content.status
     *
     * @return the value of note_content.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_content.status
     *
     * @param status the value for note_content.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_content.content
     *
     * @return the value of note_content.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_content.content
     *
     * @param content the value for note_content.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_content
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        NoteContent other = (NoteContent) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getLastUpdateTime() == null ? other.getLastUpdateTime() == null : this.getLastUpdateTime().equals(other.getLastUpdateTime()))
            && (this.getLastUpdatedUid() == null ? other.getLastUpdatedUid() == null : this.getLastUpdatedUid().equals(other.getLastUpdatedUid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_content
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        result = prime * result + ((getLastUpdatedUid() == null) ? 0 : getLastUpdatedUid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}
package com.accp.domain;

import java.util.Date;

public class User {
    private Integer uid;

	private String name;

	private String pwd;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	private Integer id;

	private String name;

	private String pwd;

	private String uimg;

	private String ucomment;

	private String sex;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUimg() {
		return uimg;
	}

	public void setUimg(String uimg) {
		this.uimg = uimg;
	}

	public String getUcomment() {
		return ucomment;
	}

	public void setUcomment(String ucomment) {
		this.ucomment = ucomment;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	private String host;

	private String user;

	private String selectPriv;

	private String insertPriv;

	private String updatePriv;

	private String deletePriv;

	private String createPriv;

	private String dropPriv;

	private String reloadPriv;

	private String shutdownPriv;

	private String processPriv;

	private String filePriv;

	private String grantPriv;

	private String referencesPriv;

	private String indexPriv;

	private String alterPriv;

	private String showDbPriv;

	private String superPriv;

	private String createTmpTablePriv;

	private String lockTablesPriv;

	private String executePriv;

	private String replSlavePriv;

	private String replClientPriv;

	private String createViewPriv;

	private String showViewPriv;

	private String createRoutinePriv;

	private String alterRoutinePriv;

	private String createUserPriv;

	private String eventPriv;

	private String triggerPriv;

	private String createTablespacePriv;

	private String sslType;

	private Integer maxQuestions;

	private Integer maxUpdates;

	private Integer maxConnections;

	private Integer maxUserConnections;

	private String plugin;

	private String passwordExpired;

	private Date passwordLastChanged;

	private Short passwordLifetime;

	private String accountLocked;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSelectPriv() {
		return selectPriv;
	}

	public void setSelectPriv(String selectPriv) {
		this.selectPriv = selectPriv;
	}

	public String getInsertPriv() {
		return insertPriv;
	}

	public void setInsertPriv(String insertPriv) {
		this.insertPriv = insertPriv;
	}

	public String getUpdatePriv() {
		return updatePriv;
	}

	public void setUpdatePriv(String updatePriv) {
		this.updatePriv = updatePriv;
	}

	public String getDeletePriv() {
		return deletePriv;
	}

	public void setDeletePriv(String deletePriv) {
		this.deletePriv = deletePriv;
	}

	public String getCreatePriv() {
		return createPriv;
	}

	public void setCreatePriv(String createPriv) {
		this.createPriv = createPriv;
	}

	public String getDropPriv() {
		return dropPriv;
	}

	public void setDropPriv(String dropPriv) {
		this.dropPriv = dropPriv;
	}

	public String getReloadPriv() {
		return reloadPriv;
	}

	public void setReloadPriv(String reloadPriv) {
		this.reloadPriv = reloadPriv;
	}

	public String getShutdownPriv() {
		return shutdownPriv;
	}

	public void setShutdownPriv(String shutdownPriv) {
		this.shutdownPriv = shutdownPriv;
	}

	public String getProcessPriv() {
		return processPriv;
	}

	public void setProcessPriv(String processPriv) {
		this.processPriv = processPriv;
	}

	public String getFilePriv() {
		return filePriv;
	}

	public void setFilePriv(String filePriv) {
		this.filePriv = filePriv;
	}

	public String getGrantPriv() {
		return grantPriv;
	}

	public void setGrantPriv(String grantPriv) {
		this.grantPriv = grantPriv;
	}

	public String getReferencesPriv() {
		return referencesPriv;
	}

	public void setReferencesPriv(String referencesPriv) {
		this.referencesPriv = referencesPriv;
	}

	public String getIndexPriv() {
		return indexPriv;
	}

	public void setIndexPriv(String indexPriv) {
		this.indexPriv = indexPriv;
	}

	public String getAlterPriv() {
		return alterPriv;
	}

	public void setAlterPriv(String alterPriv) {
		this.alterPriv = alterPriv;
	}

	public String getShowDbPriv() {
		return showDbPriv;
	}

	public void setShowDbPriv(String showDbPriv) {
		this.showDbPriv = showDbPriv;
	}

	public String getSuperPriv() {
		return superPriv;
	}

	public void setSuperPriv(String superPriv) {
		this.superPriv = superPriv;
	}

	public String getCreateTmpTablePriv() {
		return createTmpTablePriv;
	}

	public void setCreateTmpTablePriv(String createTmpTablePriv) {
		this.createTmpTablePriv = createTmpTablePriv;
	}

	public String getLockTablesPriv() {
		return lockTablesPriv;
	}

	public void setLockTablesPriv(String lockTablesPriv) {
		this.lockTablesPriv = lockTablesPriv;
	}

	public String getExecutePriv() {
		return executePriv;
	}

	public void setExecutePriv(String executePriv) {
		this.executePriv = executePriv;
	}

	public String getReplSlavePriv() {
		return replSlavePriv;
	}

	public void setReplSlavePriv(String replSlavePriv) {
		this.replSlavePriv = replSlavePriv;
	}

	public String getReplClientPriv() {
		return replClientPriv;
	}

	public void setReplClientPriv(String replClientPriv) {
		this.replClientPriv = replClientPriv;
	}

	public String getCreateViewPriv() {
		return createViewPriv;
	}

	public void setCreateViewPriv(String createViewPriv) {
		this.createViewPriv = createViewPriv;
	}

	public String getShowViewPriv() {
		return showViewPriv;
	}

	public void setShowViewPriv(String showViewPriv) {
		this.showViewPriv = showViewPriv;
	}

	public String getCreateRoutinePriv() {
		return createRoutinePriv;
	}

	public void setCreateRoutinePriv(String createRoutinePriv) {
		this.createRoutinePriv = createRoutinePriv;
	}

	public String getAlterRoutinePriv() {
		return alterRoutinePriv;
	}

	public void setAlterRoutinePriv(String alterRoutinePriv) {
		this.alterRoutinePriv = alterRoutinePriv;
	}

	public String getCreateUserPriv() {
		return createUserPriv;
	}

	public void setCreateUserPriv(String createUserPriv) {
		this.createUserPriv = createUserPriv;
	}

	public String getEventPriv() {
		return eventPriv;
	}

	public void setEventPriv(String eventPriv) {
		this.eventPriv = eventPriv;
	}

	public String getTriggerPriv() {
		return triggerPriv;
	}

	public void setTriggerPriv(String triggerPriv) {
		this.triggerPriv = triggerPriv;
	}

	public String getCreateTablespacePriv() {
		return createTablespacePriv;
	}

	public void setCreateTablespacePriv(String createTablespacePriv) {
		this.createTablespacePriv = createTablespacePriv;
	}

	public String getSslType() {
		return sslType;
	}

	public void setSslType(String sslType) {
		this.sslType = sslType;
	}

	public Integer getMaxQuestions() {
		return maxQuestions;
	}

	public void setMaxQuestions(Integer maxQuestions) {
		this.maxQuestions = maxQuestions;
	}

	public Integer getMaxUpdates() {
		return maxUpdates;
	}

	public void setMaxUpdates(Integer maxUpdates) {
		this.maxUpdates = maxUpdates;
	}

	public Integer getMaxConnections() {
		return maxConnections;
	}

	public void setMaxConnections(Integer maxConnections) {
		this.maxConnections = maxConnections;
	}

	public Integer getMaxUserConnections() {
		return maxUserConnections;
	}

	public void setMaxUserConnections(Integer maxUserConnections) {
		this.maxUserConnections = maxUserConnections;
	}

	public String getPlugin() {
		return plugin;
	}

	public void setPlugin(String plugin) {
		this.plugin = plugin;
	}

	public String getPasswordExpired() {
		return passwordExpired;
	}

	public void setPasswordExpired(String passwordExpired) {
		this.passwordExpired = passwordExpired;
	}

	public Date getPasswordLastChanged() {
		return passwordLastChanged;
	}

	public void setPasswordLastChanged(Date passwordLastChanged) {
		this.passwordLastChanged = passwordLastChanged;
	}

	public Short getPasswordLifetime() {
		return passwordLifetime;
	}

	public void setPasswordLifetime(Short passwordLifetime) {
		this.passwordLifetime = passwordLifetime;
	}

	public String getAccountLocked() {
		return accountLocked;
	}

	public void setAccountLocked(String accountLocked) {
		this.accountLocked = accountLocked;
	}

	private Integer uid;

	private String account;

	private String email;

	private String phone;

	private String pwd;

	private String uname;

	private String head;

	private String content;

	private String spare1;

	private String spare2;

	private String spare3;

	private String spare4;

	private String spare5;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSpare1() {
		return spare1;
	}

	public void setSpare1(String spare1) {
		this.spare1 = spare1;
	}

	public String getSpare2() {
		return spare2;
	}

	public void setSpare2(String spare2) {
		this.spare2 = spare2;
	}

	public String getSpare3() {
		return spare3;
	}

	public void setSpare3(String spare3) {
		this.spare3 = spare3;
	}

	public String getSpare4() {
		return spare4;
	}

	public void setSpare4(String spare4) {
		this.spare4 = spare4;
	}

	public String getSpare5() {
		return spare5;
	}

	public void setSpare5(String spare5) {
		this.spare5 = spare5;
	}

	private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
package com.entity.model;

import com.entity.CangkuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 快递仓库信息表
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-02-22
 */
public class CangkuxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 物流单号
     */
    private String logistics;


    /**
     * 快递名称 Search
     */
    private String name;


    /**
     * 快递类型 Search
     */
    private Integer kdTypes;


    /**
     * 送件人
     */
    private String courier;


    /**
     * 手机号
     */
    private String cmobile;


    /**
     * 入库时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date warehouseTime;


    /**
     * 收件人
     */
    private String recipients;


    /**
     * 手机号
     */
    private String rmobile;


    /**
     * 收件地址
     */
    private String consigneeaddress;


    /**
     * 快递状态 Search
     */
    private Integer expressTypes;


    /**
     * 描述信息
     */
    private String noticeContent;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：物流单号
	 */
    public String getLogistics() {
        return logistics;
    }


    /**
	 * 获取：物流单号
	 */

    public void setLogistics(String logistics) {
        this.logistics = logistics;
    }
    /**
	 * 设置：快递名称 Search
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：快递名称 Search
	 */

    public void setName(String name) {
        this.name = name;
    }
    /**
	 * 设置：快递类型 Search
	 */
    public Integer getKdTypes() {
        return kdTypes;
    }


    /**
	 * 获取：快递类型 Search
	 */

    public void setKdTypes(Integer kdTypes) {
        this.kdTypes = kdTypes;
    }
    /**
	 * 设置：送件人
	 */
    public String getCourier() {
        return courier;
    }


    /**
	 * 获取：送件人
	 */

    public void setCourier(String courier) {
        this.courier = courier;
    }
    /**
	 * 设置：手机号
	 */
    public String getCmobile() {
        return cmobile;
    }


    /**
	 * 获取：手机号
	 */

    public void setCmobile(String cmobile) {
        this.cmobile = cmobile;
    }
    /**
	 * 设置：入库时间
	 */
    public Date getWarehouseTime() {
        return warehouseTime;
    }


    /**
	 * 获取：入库时间
	 */

    public void setWarehouseTime(Date warehouseTime) {
        this.warehouseTime = warehouseTime;
    }
    /**
	 * 设置：收件人
	 */
    public String getRecipients() {
        return recipients;
    }


    /**
	 * 获取：收件人
	 */

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }
    /**
	 * 设置：手机号
	 */
    public String getRmobile() {
        return rmobile;
    }


    /**
	 * 获取：手机号
	 */

    public void setRmobile(String rmobile) {
        this.rmobile = rmobile;
    }
    /**
	 * 设置：收件地址
	 */
    public String getConsigneeaddress() {
        return consigneeaddress;
    }


    /**
	 * 获取：收件地址
	 */

    public void setConsigneeaddress(String consigneeaddress) {
        this.consigneeaddress = consigneeaddress;
    }
    /**
	 * 设置：快递状态 Search
	 */
    public Integer getExpressTypes() {
        return expressTypes;
    }


    /**
	 * 获取：快递状态 Search
	 */

    public void setExpressTypes(Integer expressTypes) {
        this.expressTypes = expressTypes;
    }
    /**
	 * 设置：描述信息
	 */
    public String getNoticeContent() {
        return noticeContent;
    }


    /**
	 * 获取：描述信息
	 */

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    }

package com.net.service;

import com.net.enumeration.TaskType;
import com.net.vo.CommentVO;
import com.net.vo.ResponseVO;
import com.net.vo.TaskVO;

/**
 * 任务管理
 * Created by cong on 2018-12-05.
 */
public interface TaskService {

    /**
     * 新建任务
     * @param taskVO
     * @return
     */
    public ResponseVO addTask(TaskVO taskVO);

    /**
     * 修改任务
     * 在接单开始时间之前
     * @param taskVO
     * @return
     */
    public ResponseVO updateTask(TaskVO taskVO);

    /**
     * 关闭任务
     * 在接单开始之前
     * @param taskId
     * @return
     */
    public ResponseVO closeTask(Integer taskId);

    /**
     * 接单
     * @param taskId
     * @param orderTaker
     * @return
     */
    public ResponseVO takeTask(Integer taskId,Integer orderTaker);

    /**
     * 取消接单
     * @param taskId
     * @return
     */
    public ResponseVO cancelOrder(Integer taskId);

    /**
     * 接单人完成任务
     * @param taskId
     * @return
     */
    public ResponseVO finishTask(Integer taskId);

    /**
     * 发布人确认完成任务
     * 进行积分转账
     * @param taskId
     * @return
     */
    public ResponseVO confirmFinishTask(Integer taskId);

    /**
     * 评论
     * @param commentVO
     * @return
     */
    public ResponseVO comment(CommentVO commentVO);

    /**
     * 根据发布人查询任务
     * @param publisherId
     * @return
     */
    public ResponseVO getTaskByPublisher(Integer publisherId);

    /**
     * 根据接单人查询任务
     * @param takerId
     * @return
     */
    public ResponseVO getTaskByTaker(Integer takerId);

    /**
     * 根据时间排序
     * @return
     */
    public ResponseVO getTaskByTime();

    /**
     * 根据类型筛选
     * @return
     */
    public ResponseVO getTaskByType(TaskType taskType);

    /**
     * 根据报酬排序
     * @return
     */
    public ResponseVO getTaskByPayment();

    /**
     * 根据id查询task
     * @return
     */
    public ResponseVO getTaskById(Integer taskId);


}

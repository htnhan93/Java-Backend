package hnt_15hcb2.service.Impl;

import hnt_15hcb2.dao.Impl.NotificationDAOImpl;
import hnt_15hcb2.entity.NotificationEntity;
import hnt_15hcb2.service.INotificationService;

import java.util.List;

public class NotificationService implements INotificationService<NotificationEntity> {
    private NotificationDAOImpl notificationDAO;
    public void setNotificationDAO(NotificationDAOImpl notificationDAO) {
        this.notificationDAO = notificationDAO;
    }

    @Override
    public void create(NotificationEntity notificationEntity) throws Exception {
        notificationDAO.create(notificationEntity);
    }

    @Override
    public boolean update(NotificationEntity notificationEntity) throws Exception {
        return notificationDAO.update(notificationEntity);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return notificationDAO.delete(id, NotificationEntity.class);
    }

    @Override
    public NotificationEntity get(String id) throws Exception {
        return notificationDAO.get(id, NotificationEntity.class);
    }

    @Override
    public List<NotificationEntity> getall() throws Exception {
        return notificationDAO.getall(NotificationEntity.class);
    }
}

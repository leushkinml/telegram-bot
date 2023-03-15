package pro.sky.telegrambot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pro.sky.telegrambot.model.NotificationTask;

import java.util.Collection;

@Repository
public interface NotificationTaskRepository extends JpaRepository<NotificationTask,Long> {

    @Query("SELECT nt FROM NotificationTask nt WHERE nt.timeStamp <= CURRENT_TIMESTAMP")
    Collection<NotificationTask> getScheduledTasks();

}
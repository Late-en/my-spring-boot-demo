package orm.mybatisPlus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author Late-en
 * 继承 model 的 active record 模式
 */

@Data
//不写默认为false，当该值为 true 时，对应字段的 setter 方法调用后，会返回当前对象。
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@TableName("orm_role")
public class Role extends Model<Role> implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 角色名
     */
    private String name;
}

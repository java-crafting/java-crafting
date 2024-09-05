## gitlab
```
http://gitlab.localhost
```

## Узнать список пользователей в Gitlab и их права:
```
User.all.each do |user|
  admin_status = user.admin? ? "Admin" : "Regular"
  puts "User: #{user.username}, ID: #{user.id}, Status: #{admin_status}"
end
```

## Сброс пароля админа root и установка пароля ComplexP@ssw0rd2024!
```
user = User.find_by(username: 'root')
user.password = 'ComplexP@ssw0rd2024!'
user.password_confirmation = 'ComplexP@ssw0rd2024!'
user.save!
puts "Password for root user has been reset to 'ComplexP@ssw0rd2024!'"
```

## gitlab admin
```
root
ComplexP@ssw0rd2024!
```

## jira
```
http://localhost:8081
```
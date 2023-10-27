-- 코드를 입력하세요
SELECT food_type, rest_id, rest_name, favorites from rest_info
where (food_type, favorites) in(
    select food_type, max(favorites) from rest_info
    group by food_type
)
order by food_type desc;

# select max(favorites) from rest_info
# group by food_type;

# select * from rest_info
# order by food_type asc, favorites desc ;
#import <React/RCTBridgeModule.h>

@interface OrientationLock : NSObject <RCTBridgeModule> {
}
- (void) lockToPortrait;
- (void) lockToLandscape;
- (void) unlock;
@end